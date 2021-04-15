package es.geospain.api.data.bootstrap;

import es.geospain.api.data.entity.ComunidadEntity;
import es.geospain.api.data.repository.ComunidadRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
**/
@Slf4j
@Component
public class ComunidadDataLoader implements CommandLineRunner{

    private final ComunidadRepository repository;

    public ComunidadDataLoader(ComunidadRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(repository.count() == 0){
            loadComunidades();
            log.info("Loaded Comunidades: " + repository.count());
        }

    }

    private void loadComunidades() {

        List<ComunidadEntity> comunidades = builComunidadEntityList();

        comunidades.forEach(comunidadEntity -> {
            repository.save(comunidadEntity);
        });

    }

    private List<ComunidadEntity> builComunidadEntityList() {

        List<ComunidadEntity> comunidadEntities = new ArrayList<>();

        comunidadEntities.add(ComunidadEntity.builder().id(1L).name("Cataluña").build());
        comunidadEntities.add(ComunidadEntity.builder().id(2L).name("País Vasco").build());

        return comunidadEntities;

    }

}

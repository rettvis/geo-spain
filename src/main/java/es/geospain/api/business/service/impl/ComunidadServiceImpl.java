package es.geospain.api.business.service.impl;

import es.geospain.api.business.domain.Comunidad;
import es.geospain.api.business.service.interfaces.ComunidadService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
**/
@Service
public class ComunidadServiceImpl implements ComunidadService {

    @Override
    public List<Comunidad> getAllComunidades() {

        List<Comunidad> comunidades = new ArrayList<>();

        comunidades.add(Comunidad.builder().id(1L).comunidad("Cataluña").build());
        comunidades.add(Comunidad.builder().id(2L).comunidad("País Vasco").build());

        return comunidades;

    }

}

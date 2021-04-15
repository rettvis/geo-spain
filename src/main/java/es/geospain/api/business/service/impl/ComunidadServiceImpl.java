package es.geospain.api.business.service.impl;

import es.geospain.api.business.domain.Comunidad;
import es.geospain.api.business.mapper.ComunidadMapper;
import es.geospain.api.business.service.interfaces.ComunidadService;
import es.geospain.api.data.entity.ComunidadEntity;
import es.geospain.api.data.repository.ComunidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
**/
@Service
public class ComunidadServiceImpl implements ComunidadService {

    @Autowired
    ComunidadRepository comunidadRepository;

    @Autowired
    ComunidadMapper comunidadMapper;

    @Override
    public List<Comunidad> getAllComunidades() {

        Iterable<ComunidadEntity> comunidadEntities = comunidadRepository.findAll();
        List<Comunidad> comunidades = new ArrayList<>();

        comunidadEntities.forEach(comunidadEntity -> {
            comunidades.add(comunidadMapper.comunidadEntityToComunidad(comunidadEntity));
        });

        return comunidades;

    }

}

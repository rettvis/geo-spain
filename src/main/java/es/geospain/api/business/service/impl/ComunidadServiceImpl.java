package es.geospain.api.business.service.impl;

import es.geospain.api.business.domain.Comunidad;
import es.geospain.api.business.language.SupportedLanguages;
import es.geospain.api.business.mapper.ComunidadMapper;
import es.geospain.api.business.service.interfaces.ComunidadService;
import es.geospain.api.data.entity.ComunidadEntity;
import es.geospain.api.data.repository.ComunidadRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static es.geospain.api.data.specification.ComunidadSpecification.inLanguage;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
**/
@Service
@AllArgsConstructor
public class ComunidadServiceImpl implements ComunidadService {

    private final ComunidadMapper comunidadMapper;
    private final ComunidadRepository comunidadRepository;

    @Override
    public List<Comunidad> getAllComunidades(SupportedLanguages language) {

        List<Comunidad> comunidades = new ArrayList<>();
        Specification<ComunidadEntity> specification = inLanguage(language);

        Iterable<ComunidadEntity> comunidadEntities = comunidadRepository.findAll(specification);

        comunidadEntities.forEach(
                comunidadEntity -> comunidades.add(comunidadMapper.comunidadEntityToComunidad(comunidadEntity))
        );

        return comunidades;

    }

}

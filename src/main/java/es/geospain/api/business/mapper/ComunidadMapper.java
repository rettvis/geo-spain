package es.geospain.api.business.mapper;

import es.geospain.api.business.domain.Comunidad;
import es.geospain.api.data.entity.ComunidadEntity;
import org.mapstruct.Mapper;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
 **/
@Mapper(componentModel = "spring")
public interface ComunidadMapper {

    Comunidad comunidadEntityToComunidad(ComunidadEntity entity);

}

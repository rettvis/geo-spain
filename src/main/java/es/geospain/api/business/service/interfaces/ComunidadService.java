package es.geospain.api.business.service.interfaces;

import es.geospain.api.business.domain.Comunidad;
import es.geospain.api.business.language.SupportedLanguages;

import java.util.List;
import java.util.Optional;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
 **/
public interface ComunidadService {

    List<Comunidad> getAllComunidades(Optional<SupportedLanguages> language);

}

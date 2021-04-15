package es.geospain.api.business.service.interfaces;

import es.geospain.api.business.domain.Comunidad;
import es.geospain.api.business.language.SupportedLanguages;

import java.util.List;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
 **/
public interface ComunidadService {

    List<Comunidad> getAllComunidades(SupportedLanguages language);

}

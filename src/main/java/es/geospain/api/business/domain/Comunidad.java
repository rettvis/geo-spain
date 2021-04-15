package es.geospain.api.business.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
**/
@Data
@Builder
public class Comunidad {

    private Long id;
    private String comunidad;

}

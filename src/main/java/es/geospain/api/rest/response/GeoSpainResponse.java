package es.geospain.api.rest.response;

import es.geospain.api.business.domain.Comunidad;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
**/
@Data
@Builder
public class GeoSpainResponse {

    private String updated;
    private int size;
    private List<Comunidad> data;

}

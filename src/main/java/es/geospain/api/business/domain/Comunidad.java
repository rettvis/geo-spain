package es.geospain.api.business.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
**/
@Data
@Builder
public class Comunidad {

    private Long id;
    private String name;

    @JsonIgnore
    private LocalDateTime createdDate;

    @JsonIgnore
    private LocalDateTime updatedDate;

}

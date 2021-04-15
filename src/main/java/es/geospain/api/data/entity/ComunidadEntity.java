package es.geospain.api.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
**/
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ComunidadEntity {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LANGUAGE")
    private int language;

}

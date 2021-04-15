package es.geospain.api.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
**/
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "GEOSPAIN_COMUNIDADES")
public class ComunidadEntity {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LANG")
    private int language;

    @Column(name ="CREATED_DATE")
    private LocalDateTime createdDate;

    @Column(name ="UPDATED_DATE")
    private LocalDateTime updatedDate;

}

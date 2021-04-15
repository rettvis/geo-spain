package es.geospain.api.data.repository;

import es.geospain.api.data.entity.ComunidadEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
 **/
public interface ComunidadRepository extends PagingAndSortingRepository<ComunidadEntity, Long> {}

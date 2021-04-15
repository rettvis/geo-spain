package es.geospain.api.data.specification;

import es.geospain.api.business.language.SupportedLanguages;
import es.geospain.api.data.entity.ComunidadEntity;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
**/
public class ComunidadSpecification {

    public static Specification<ComunidadEntity> inLanguage(SupportedLanguages supportedLanguage){

        return (Specification<ComunidadEntity>) (root, query, criteriaBuilder) -> {

            List<Predicate> predicates = new ArrayList<>();

            if(Objects.nonNull(supportedLanguage)){
                predicates.add(criteriaBuilder.equal(root.<String>get("language"), supportedLanguage.getValue()));
            } else {
                predicates.add(criteriaBuilder.equal(root.<String>get("language"), 2));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));

        };

    }

}

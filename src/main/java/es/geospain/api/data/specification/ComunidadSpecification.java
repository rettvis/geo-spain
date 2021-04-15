package es.geospain.api.data.specification;

import es.geospain.api.business.language.SupportedLanguages;
import es.geospain.api.data.entity.ComunidadEntity;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
**/
public class ComunidadSpecification {

    public static Specification<ComunidadEntity> inLanguage(Optional<SupportedLanguages> supportedLanguage){

        return (Specification<ComunidadEntity>) (root, query, criteriaBuilder) -> {

            List<Predicate> predicates = new ArrayList<>();

            if(supportedLanguage.isPresent()){
                SupportedLanguages language = supportedLanguage.get();
                predicates.add(criteriaBuilder.equal(root.<String>get("language"), language.getValue()));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));

        };

    }

}
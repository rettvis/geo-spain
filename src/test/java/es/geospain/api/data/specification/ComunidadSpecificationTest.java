package es.geospain.api.data.specification;

import es.geospain.api.business.language.SupportedLanguages;
import es.geospain.api.data.entity.ComunidadEntity;
import org.junit.jupiter.api.Test;
import org.springframework.data.jpa.domain.Specification;

import java.util.concurrent.atomic.AtomicReference;

import static es.geospain.api.data.specification.ComunidadSpecification.inLanguage;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
**/
public class ComunidadSpecificationTest {

    @Test
    void inLanguage_WhenSupportedLanguagesIsCat_ThenReturnSpecification() {

        AtomicReference<Specification<ComunidadEntity>> specification = new AtomicReference<>();

        assertAll(
                () -> assertDoesNotThrow(()->{
                    specification.set(inLanguage(SupportedLanguages.cat));
                }),
                () -> assertNotNull(specification)
        );

    }

    @Test
    void inLanguage_WhenSupportedLanguagesIsEsp_ThenReturnSpecification() {

        AtomicReference<Specification<ComunidadEntity>> specification = new AtomicReference<>();

        assertAll(
                () -> assertDoesNotThrow(()->{
                    specification.set(inLanguage(SupportedLanguages.esp));
                }),
                () -> assertNotNull(specification)
        );

    }

    @Test
    void inLanguage_WhenSupportedLanguagesIsNull_ThenReturnDefaultSpecification() {

        AtomicReference<Specification<ComunidadEntity>> specification = new AtomicReference<>();

        assertAll(
                () -> assertDoesNotThrow(()->{
                    specification.set(inLanguage(null));
                }),
                () -> assertNotNull(specification)
        );

    }

}

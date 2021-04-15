package es.geospain.api.data.repository;

import es.geospain.api.business.language.SupportedLanguages;
import es.geospain.api.data.entity.ComunidadEntity;
import es.geospain.api.data.specification.ComunidadSpecification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
**/
@DataJpaTest
@TestPropertySource("classpath:application-test.properties")
public class ComunidadRepositoryTest {

    @Autowired
    private ComunidadRepository comunidadRepository;

    @Test
    void findAll_WhenLanguageIsCat_ThenReturnComunidadesInCatalan() {

        Specification<ComunidadEntity> specification = ComunidadSpecification.inLanguage(SupportedLanguages.cat);
        List<ComunidadEntity> comunidades = comunidadRepository.findAll(specification);

        assertAll(
                () -> assertNotNull(comunidades),
                () -> assertEquals(comunidades.get(0).getLanguage(), SupportedLanguages.cat.getValue()),
                () -> assertEquals(4, comunidades.size())
        );

    }

    @Test
    void findAll_WhenLanguageIsEsp_ThenReturnComunidadesInSpanish() {

        Specification<ComunidadEntity> specification = ComunidadSpecification.inLanguage(SupportedLanguages.esp);
        List<ComunidadEntity> comunidades = comunidadRepository.findAll(specification);

        assertAll(
                () -> assertNotNull(comunidades),
                () -> assertEquals(comunidades.get(0).getLanguage(), SupportedLanguages.esp.getValue()),
                () -> assertEquals(5, comunidades.size())
        );

    }

    @Test
    void findAll_WhenLanguageIsNull_ThenReturnComunidadesInSpanishAsDefaultLenguage() {

        Specification<ComunidadEntity> specification = ComunidadSpecification.inLanguage(null);
        List<ComunidadEntity> comunidades = comunidadRepository.findAll(specification);

        assertAll(
                () -> assertNotNull(comunidades),
                () -> assertEquals(comunidades.get(0).getLanguage(), SupportedLanguages.esp.getValue()),
                () -> assertEquals(5, comunidades.size())
        );

    }

}

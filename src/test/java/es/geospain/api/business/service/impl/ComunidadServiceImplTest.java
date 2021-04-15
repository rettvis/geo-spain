package es.geospain.api.business.service.impl;

import es.geospain.api.business.mapper.ComunidadMapper;
import es.geospain.api.data.repository.ComunidadRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;

/**
 * @author: guillem.casas
 * @version: 15/04/2021
**/
@DataJpaTest
@TestPropertySource("classpath:application-test.properties")
public class ComunidadServiceImplTest {

    @Mock
    private ComunidadMapper comunidadMapper;

    @Autowired
    private ComunidadRepository comunidadRepository;

    private ComunidadServiceImpl comunidadService;

    @BeforeEach
    void init() {
        comunidadService = new ComunidadServiceImpl(comunidadMapper, comunidadRepository);
    }

    @Test
    void getAllComunidades_WhenLanguageNull_ThenReturnAllComunidades() {
        comunidadService.getAllComunidades(null);
    }

}

package es.geospain.api.rest.controller;

import es.geospain.api.business.domain.Comunidad;
import es.geospain.api.business.language.SupportedLanguages;
import es.geospain.api.business.service.interfaces.ComunidadService;
import es.geospain.api.rest.response.GeoSpainResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * @author: guillem.casas
 * @version: 14/04/2021
**/
@RestController
@RequestMapping("/v1")
public class ComunidadController {

    @Autowired
    ComunidadService comunidadService;

    @GetMapping("/comunidades")
    public ResponseEntity<GeoSpainResponse> getAllComunidades(@RequestParam("lang") Optional<SupportedLanguages> supportedLanguages){

        SupportedLanguages language = Objects.nonNull(supportedLanguages) ? supportedLanguages.get() : null;

        List<Comunidad> comunidades = comunidadService.getAllComunidades(language);
        LocalDateTime updatedDate = !CollectionUtils.isEmpty(comunidades) ? comunidades.get(0).getUpdatedDate() : LocalDateTime.now();

        GeoSpainResponse geoSpainResponse = GeoSpainResponse.builder()
                                                                .updated(updatedDate.toLocalDate().toString())
                                                                .size(comunidades.size())
                                                                .data(comunidades)
                                                                .build();

        return new ResponseEntity(geoSpainResponse, HttpStatus.OK);

    }

}

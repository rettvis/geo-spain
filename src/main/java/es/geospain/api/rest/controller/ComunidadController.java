package es.geospain.api.rest.controller;

import es.geospain.api.business.domain.Comunidad;
import es.geospain.api.business.language.SupportedLanguages;
import es.geospain.api.business.service.interfaces.ComunidadService;
import es.geospain.api.rest.response.GeoSpainResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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
    public ResponseEntity<GeoSpainResponse> getAllComunidades(@RequestParam("lang") Optional<SupportedLanguages> language){

        List<Comunidad> comunidades = comunidadService.getAllComunidades(language);
        GeoSpainResponse geoSpainResponse = GeoSpainResponse.builder()
                                                                .size(comunidades.size())
                                                                .data(comunidades)
                                                                .build();

        return new ResponseEntity(geoSpainResponse, HttpStatus.OK);

    }

}

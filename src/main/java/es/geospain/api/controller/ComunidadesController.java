package es.geospain.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: guillem.casas
 * @version: 14/04/2021
**/
@RestController
@RequestMapping("/v1")
public class ComunidadesController {

    @GetMapping("comunidades")
    public ResponseEntity getAllComunidades(){
        return new ResponseEntity("TEST01", HttpStatus.OK);
    }

}

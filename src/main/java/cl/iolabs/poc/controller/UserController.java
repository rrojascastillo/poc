package cl.iolabs.poc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String homepage(){
        return "Aplicacion de Prueba Spring Boot desde Git";
    }
}

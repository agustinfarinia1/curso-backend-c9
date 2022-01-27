package com.farinia.desafioNginx.controller;
import com.farinia.desafioNginx.model.Mensajes;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nginx")
public class NginxController {

    @GetMapping("/mensaje")
    public List<Mensajes> getNginx(){
    return List.of(new Mensajes("Hola Mundo"), new Mensajes("Puerto 8082"));
    }
}

package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class Demo {
    @GetMapping(path = "/ciao")
    public Oggetto mioController(@RequestParam String nome, @RequestParam String provincia, @RequestParam String saluto) {
        return new Oggetto(nome, provincia, saluto);

        // OK:
        // localhost:8080/v2/ciao?&nome=Pietro&provincia=Trapani&saluto=Ciao%20a%20tutti
    }
}

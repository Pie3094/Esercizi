package com.example.demowebapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/ciao") // In questa maniera funziona, MA i paramaetri richiesti sono OBBLIGATORI
    public String saluto(@RequestParam String nome, @RequestParam String cognome) {
        return "Ciao " + nome + " " + cognome + "!";
    }


// localhost:8080/v1/ [metodoName]
// ? Significa riempi con. & Per passare di parametro esempio: /v1/ciao?nome=Pietro&cognome=DiGiovanni

    @GetMapping(path = "/ciao1") // In questa maniera funziona, ed i parametri sono "required" false o true
    public String saluto1(@RequestParam(required = true) String nome, @RequestParam(required = false, defaultValue = "") String cognome) {
        return "Ciao " + nome + " " + cognome + "!";
    }

    @GetMapping(path = "/ciao2")
    public String saluto2(@RequestParam(required = true) String name, @RequestParam(required = true) String provincia) {
        return "ciao " + name + ", com'è il tempo in " + provincia + "?";
    }
}


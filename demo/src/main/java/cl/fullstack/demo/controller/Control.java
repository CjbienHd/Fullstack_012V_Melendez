package cl.fullstack.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
    @GetMapping("/api")
    public String status(){
        return "Programa funcionando correctamente";
    }
}

package cl.fullstack.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/ecomarket")
public class Control {
    
    @GetMapping
    public String status(){
        return "Programa funcionando correctamente";
    }

}

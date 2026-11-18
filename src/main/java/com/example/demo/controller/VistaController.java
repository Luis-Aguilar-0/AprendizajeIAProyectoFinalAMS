package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller 
public class VistaController {

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @GetMapping("/paginaPrincipal")
    public String paginaPrincipal(){
        return "paginaPrincipal";
    }

    @GetMapping ("/leccion")
    public String leccionPagina(){
        return "leccion";
    }
    
}

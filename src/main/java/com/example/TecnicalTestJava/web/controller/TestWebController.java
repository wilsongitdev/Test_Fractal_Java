package com.example.TecnicalTestJava.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java")
public class TestWebController {
    @GetMapping("/mensajeprueba")
    public String mensaje(){
        return "Hola";
    }
}

package com.example.api_login.controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequiredArgsConstructor
public class HelloController {

    @GetMapping("/")
    public String greeting() {
        return "Hello Word!";
    }

    @GetMapping("/secured")
    public String secured(){
        return "Você esta logado com Segurança!!";
    }
}

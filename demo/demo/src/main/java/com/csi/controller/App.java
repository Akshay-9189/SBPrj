package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class App {

    @GetMapping("/a")
    public String sayHello(){
        return "Welcome";
    }

    @GetMapping("/s")
    public String servicesF(){
        return "Java";
    }
}

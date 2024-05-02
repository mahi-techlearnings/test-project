package com.example.testproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping
    public ResponseEntity<?> sayHello() {
        System.out.println("Hello");
        return ResponseEntity.ok("Hello World!");
    }
}

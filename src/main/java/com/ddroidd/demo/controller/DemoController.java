package com.ddroidd.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value = "/test")
    public ResponseEntity<String> getProducts() {
        return ResponseEntity.ok("test message");
    }
}

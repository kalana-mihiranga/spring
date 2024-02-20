package com.example.exmple2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontroller {
    @GetMapping("/kala")
    public ResponseEntity<String>  kalana() {
        return ResponseEntity.status(HttpStatus.OK).body("kajhdbvuhdvu");

    }

}

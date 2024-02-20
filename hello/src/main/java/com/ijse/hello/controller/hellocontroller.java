package com.ijse.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController


public class hellocontroller {

    @GetMapping("/path")
    public String kjbi() {
        return "jdijbdibidub";
    }
    
    
}

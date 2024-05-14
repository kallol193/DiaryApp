package com.example.DiaryApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class HealthController {

    @GetMapping("/health")
    public String heath(){
        return "EveryThing good to go!!";
    }
}

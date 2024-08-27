package com.baguvix.baguvix.controller;

import com.baguvix.baguvix.domain.HomelessPerson;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @GetMapping
    public String hello(){
        return "Hello World";
    }

    @PostMapping("")
    public String LoginController(@RequestBody HomelessPerson homelessPerson) {
        return "hello" + homelessPerson.getUsername();
    }
}

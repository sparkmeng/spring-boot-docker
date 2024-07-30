package com.example.springbootdocker;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloWorldController {


    @GetMapping
    public String index() {
        return "Hello,Bigzz";
    }

}


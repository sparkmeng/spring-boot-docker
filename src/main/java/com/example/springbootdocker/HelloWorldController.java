package com.example.springbootdocker;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {


    @GetMapping
    public String index() {
        return "Hello,Bigzz";
    }

}


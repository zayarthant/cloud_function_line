package com.mdls.lab.function;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoints {
    
    @GetMapping("/")
    public String hello(@RequestParam("name") String name){
        return "Hello " + name;
    }

}

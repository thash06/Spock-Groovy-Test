package com.thash.spock.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {

    @GetMapping
    public String test() {
        System.out.println(" INVOKED TEST.....");
        return "Hello world!";
    }
}

package me.zzy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerTestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}

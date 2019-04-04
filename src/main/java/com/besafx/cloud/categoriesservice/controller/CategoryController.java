package com.besafx.cloud.categoriesservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @GetMapping("/")
    public String home() {
        return "Welcome From Categories Client";
    }
}

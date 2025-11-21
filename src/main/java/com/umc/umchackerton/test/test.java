package com.umc.umchackerton.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("/health")
    public String health() {
        return "ok, It's work!";
    }
}

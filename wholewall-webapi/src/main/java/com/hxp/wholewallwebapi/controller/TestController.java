package com.hxp.wholewallwebapi.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: hxp
 * @Date: 2023/12/18 17:00
 * @Describe:
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "helloworld";
    }
}

package com.heitzuli.socialbackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/posts")
public class PostController {
    @GetMapping
    public List<String> findAll() {
        return Stream.of("1", "two", "threes").toList();
    }
}

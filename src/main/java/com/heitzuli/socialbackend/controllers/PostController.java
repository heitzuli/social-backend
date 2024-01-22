package com.heitzuli.socialbackend.controllers;

import com.heitzuli.socialbackend.dto.Post;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
@CrossOrigin
@RequestMapping("/posts")
public class PostController {
    @GetMapping
    public List<Post> findAll() {
        var post1 = new Post(1, "Hello wrold");
        var post2 = new Post(2, "Hello wolrd");
        var post3 = new Post(3, "Hello WORLD");
        return Stream.of(post1, post2, post3).toList();
    }
}

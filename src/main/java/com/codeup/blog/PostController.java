package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    // Posts Index Page
    @GetMapping("/posts")
    @ResponseBody
    public String postsDescription() {
        return "posts index page\n";
    }

    // Individual Post Page
    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postsIDDescription(@PathVariable String id) {
        return "view an individual post\n\n";
    }

    // Form For Creating Post
    @GetMapping("/posts/create")
    @ResponseBody
    public String postsCreateFormDescription() {
        return "view the form for creating a post\n";
    }

    // Creating Post
    @PostMapping("/posts/create")
    @ResponseBody
    public String postsCreateDescription() {
        return "create a new post\n";
    }
}

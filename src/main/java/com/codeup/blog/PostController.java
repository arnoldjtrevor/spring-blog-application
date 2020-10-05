package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    // Posts Index
    @GetMapping("/posts")
    @ResponseBody
    public String postsDescription() {
        return "posts index page\n";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postsIDDescription(@PathVariable String id) {
        return "posts index page\n";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postsCreateFormDescription() {
        return "view the form for creating a post\n";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String postsCreateDescription() {
        return "create a new post\n";
    }
}

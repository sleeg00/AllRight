package com.example.cb.Controller;

import com.example.cb.DTO.PostDto;
import com.example.cb.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("/create")
    public String create(@ModelAttribute PostDto postDto, HttpServletResponse response){
        postService.update(postDto);
        postService.save(postDto);
        return "해치웠나?";
    }
}

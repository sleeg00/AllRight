package com.example.cb.Controller;

import com.example.cb.DTO.PostDto;
import com.example.cb.Entity.Post;
import com.example.cb.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/search/{name}")
    public List<Post> search(@PathVariable String name, HttpServletResponse response){
        try{
            List <Post> post = postService.search(name);
            if(post.isEmpty()) { response.setStatus(HttpServletResponse.SC_OK);
                return post;
            }
            else { response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                return null;
            }
        }
        catch(Exception e){ response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return null;
        }
    }

    @PostMapping("/create")
    public Post create(@ModelAttribute PostDto postDto, HttpServletResponse response){
        //postService.update(postDto);
        try{
            Optional <Post> post  = Optional.ofNullable(postService.save(postDto));
            if(post.isPresent()){response.setStatus(HttpServletResponse.SC_OK);
                return post.get();
            }
            else { response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                return null;
            }
        }catch (Exception e){ response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return null;
        }
    }
}

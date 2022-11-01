package com.example.cb.Service;

import com.example.cb.DTO.PostDto;
import com.example.cb.Entity.Post;
import com.example.cb.Mapper.PostMapper;
import com.example.cb.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;
    PostMapper postMapper;

    public PostService(PostMapper postMapper){
        this.postMapper=postMapper;
    }

    /*
    유저 저장
     */

    /*
    public Post save(PostDto postDto){
        Post post = postMapper.toEntity(postDto);
        if (postRepository.findBypostId(postDto.getPostId())) {
            return postRepository.(post);
        } else {
            return postRepository.save(post);
        }
    }
    */

    public List<Post> search(String name){
        return postRepository.findBypostAuthor(name);
    }
    /*
    public void update(PostDto postDto){
        Optional<Post> post = postRepository.findById(postDto.getPost_like());
        if(post.isPresent()){
            save(postDto);
            System.exit(1);
        }
        else
            System.exit(1);
    }
    */

}

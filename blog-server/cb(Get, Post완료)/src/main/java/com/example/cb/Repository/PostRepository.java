package com.example.cb.Repository;

import com.example.cb.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findBypostAuthor(String postAuthor);

    boolean findBypostId(Long postId);
}

package com.example.cb.DTO;

import com.example.cb.Entity.Post;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class PostDto {
    private String post_id;

    private String post_title;

    private String post_author;

    private String post_content;

    private Long post_like;

    private Long post_views;

    private Boolean post_isSecret;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date post_createAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date post_editAt;
    private String post_temporary;
    private String post_image;

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public void setPost_author(String post_author) {
        this.post_author = post_author;
    }

    public void setPost_content(String post_content) {
        this.post_content = post_content;
    }

    public void setPost_like(Long post_like) {
        this.post_like = post_like;
    }

    public void setPost_views(Long post_views) {
        this.post_views = post_views;
    }

    public void setPost_isSecret(Boolean post_isSecret) {
        this.post_isSecret = post_isSecret;
    }

    public void setPost_createAt(Date post_createAt) {
        this.post_createAt = post_createAt;
    }

    public void setPost_editAt(Date post_editAt) {
        this.post_editAt = post_editAt;
    }

    public void setPost_temporary(String post_temporary) {
        this.post_temporary = post_temporary;
    }

    public void setPost_image(String post_image) {
        this.post_image = post_image;
    }

    public String getPost_id() {
        return post_id;
    }

    public String getPost_title() {
        return post_title;
    }

    public String getPost_author() {
        return post_author;
    }

    public String getPost_content() {
        return post_content;
    }

    public Long getPost_like() {
        return post_like;
    }

    public Long getPost_views() {
        return post_views;
    }

    public Boolean getPost_isSecret() {
        return post_isSecret;
    }

    public Date getPost_createAt() {
        return post_createAt;
    }

    public Date getPost_editAt() {
        return post_editAt;
    }

    public String getPost_temporary() {
        return post_temporary;
    }

    public String getPost_image() {
        return post_image;
    }
}

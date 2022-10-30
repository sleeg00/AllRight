package com.example.cb.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Entity
public class Post {
    @Id
    @Column(name = "Id")
    private String post_id;

    @Column(name = "title")
    private String post_title;

    @Column(name = "author", nullable = false)
    private String post_author;

    @Column(name = "content")
    private String post_content;

    @Column(name = "_like")
    private Long post_like;

    @Column(name = "views")
    private Long post_views;

    @Column(name = "isSecret", nullable = false)
    private Boolean post_isSecret;

    @Column(name = "createAt", nullable = false)
    private Date post_createAt;

    @Column(name = "editAt")
    private Date post_editAt;

    @Column(name = "temporary_save")
    private String post_temporary;

    @Column(name = "image")
    private String post_image;

    public Post(){}

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
}

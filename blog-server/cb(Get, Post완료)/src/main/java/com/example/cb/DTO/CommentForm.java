package com.example.cb.DTO;

import com.example.cb.Entity.Comment;

import java.util.Date;

public class CommentForm {
    private String comment_id;
    private String comment_post_id;
    private String comment_author;
    private String comment_content;
    private Date comment_lastEditedAt;
    private Date comment_createdAt;
    private Boolean comment_isSecret;
    private Long comment_like;

    public CommentForm(String comment_id, String comment_post_id) {
        this.comment_id = comment_id;
        this.comment_post_id = comment_post_id;
    }

    @Override
    public String toString() {
        return "CommentForm{" +
                "comment_id='" + comment_id + '\'' +
                ", comment_post_id='" + comment_post_id + '\'' +
                '}';
    }
    public Comment toEntity() {
        return new Comment(comment_id, comment_post_id);
    }
}

package com.example.cb.VO;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class PostVo {
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
}

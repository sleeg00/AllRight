package com.example.cb.Mapper;

import com.example.cb.DTO.PostDto;
import com.example.cb.Entity.Post;
import com.example.cb.GenericMapper;
import com.example.cb.VO.PostVo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring") //mapstruct 인식
public interface PostMapper extends EntityMapper<PostDto, Post> {

}

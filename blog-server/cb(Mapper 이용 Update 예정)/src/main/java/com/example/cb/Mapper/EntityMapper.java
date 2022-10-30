package com.example.cb.Mapper;

public interface EntityMapper <D, E>{
    E toEntity (D dto);
    D toDto (E entity);
}

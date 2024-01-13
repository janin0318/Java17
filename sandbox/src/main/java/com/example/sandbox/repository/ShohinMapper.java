package com.example.sandbox.repository;

import com.example.sandbox.dto.Shohin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShohinMapper {
  List<Shohin> findAll();
}

package com.example.sandbox.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleLikeMapper {
  List<String> findAll();

  String findByPk(String pk);
}

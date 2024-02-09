package com.example.sandbox.mapper;

import com.example.sandbox.dto.Shohin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShohinMapper {
  List<Shohin> findAll();
  
  Shohin findByShohinMei(String shohinMei);
  
  Shohin findByShohinId(String shohinId);
  
  Integer insertShohin(Shohin shohin);
}

package com.example.sandbox.service.impl;

import com.example.sandbox.dto.Shohin;
import com.example.sandbox.repository.ShohinMapper;
import com.example.sandbox.service.ShohinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShohinServiceImpl implements ShohinService {

  private final ShohinMapper shohinMapper;

  @Autowired
  public ShohinServiceImpl(ShohinMapper shohinMapper) {
    this.shohinMapper = shohinMapper;
  }
  
  @Override
  public List<Shohin> getAllShohin() {
    return shohinMapper.findAll();
  }

  @Override
  public List<String> getAllShohinMei() {
    List<Shohin> shohinList = shohinMapper.findAll();
    return shohinList.stream().map(Shohin::getShohinMei).toList();
  }
}

package com.example.sandbox.service;

import com.example.sandbox.dto.Shohin;

import java.util.List;

public interface ShohinService {
  
  List<Shohin> getAllShohin();
  
  Shohin getShohinDetail(String shohinId);
  
  List<String> getAllShohinMei();
  
  int registerShohin(Shohin shohin);
}

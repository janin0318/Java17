package com.example.sandbox.service;

import com.example.sandbox.dto.Shohin;

import java.util.List;

public interface ShohinService {
  List<Shohin> getAllShohin();
  List<String> getAllShohinMei();
  void registerShohin(Shohin shohin);
}

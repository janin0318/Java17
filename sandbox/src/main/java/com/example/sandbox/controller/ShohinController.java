package com.example.sandbox.controller;

import com.example.sandbox.service.ShohinService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShohinController {

  private final ShohinService shohinService;

  public ShohinController(ShohinService shohinService) {
    this.shohinService = shohinService;
  }

  @GetMapping("/shohins")
  public String getShohin() {
    return shohinService.getAllShohin().toString();
  }
  
  @GetMapping("/shohinmei")
  public String getAllShohinMei() {
    return shohinService.getAllShohinMei().toString();
  }
}

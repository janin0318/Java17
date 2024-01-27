package com.example.sandbox.controller.rest;

import com.example.sandbox.service.ShohinService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class ShohinRestController {

  private final ShohinService shohinService;

  public ShohinRestController(ShohinService shohinService) {
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

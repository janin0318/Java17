package com.example.sandbox.controller.rest;

import com.example.sandbox.dto.Shohin;
import com.example.sandbox.service.ShohinService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class ShohinRestController {

  private final ShohinService shohinService;

  public ShohinRestController(ShohinService shohinService) {
    this.shohinService = shohinService;
  }

  @GetMapping("/shohins")
  public List<Shohin> getShohin() {
    return shohinService.getAllShohin();
  }
  
  @GetMapping("/shohinmei")
  public List<String> getAllShohinMei() {
    return shohinService.getAllShohinMei();
  }
  
  @GetMapping("/shohin/{shohinId}")
  public Shohin getShohinDetail(@PathVariable String shohinId) {
    return shohinService.getShohinDetail(shohinId);
  }
  
  @GetMapping("/shohin")
  public Shohin getShohinDetailByParam(@RequestParam String shohinId) {
    return shohinService.getShohinDetail(shohinId);
  }
}

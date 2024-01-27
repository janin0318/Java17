package com.example.sandbox.controller;

import com.example.sandbox.dto.Shohin;
import com.example.sandbox.service.ShohinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ShohinController {
  
  private final ShohinService shohinService;
  
  @Autowired
  public ShohinController(ShohinService shohinService) {
    this.shohinService = shohinService;
  }
  
  @GetMapping("/shohins")
  public String show(Model model) {
    List<Shohin> shohinList = shohinService.getAllShohin();
    model.addAttribute("shohinList", shohinList);
    return "shohin/shohins";
  }
}

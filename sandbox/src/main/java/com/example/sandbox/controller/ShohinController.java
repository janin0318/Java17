package com.example.sandbox.controller;

import com.example.sandbox.dto.Shohin;
import com.example.sandbox.service.ShohinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ShohinController {
  
  private final ShohinService shohinService;
  
  @Autowired
  public ShohinController(ShohinService shohinService) {
    this.shohinService = shohinService;
  }
  
  @GetMapping("/shohins")
  public String indexShohins(Model model) {
    List<Shohin> shohinList = shohinService.getAllShohin();
    model.addAttribute("shohinList", shohinList);
    return "shohin/shohins";
  }
  
  @GetMapping("/shohins/create")
  public String newShohin(Model model) {
    Shohin shohin = new Shohin();
    model.addAttribute("shohin", shohin);
    return "shohin/shohinForm";
  }
  
  @PostMapping("/shohins/create")
  public String createShohin(@Validated Shohin shohin, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "shohin/shohinForm";
    }
    shohin.setShohinId("0009");
    shohinService.registerShohin(shohin);
    return "redirect:/shohins";
  }
}

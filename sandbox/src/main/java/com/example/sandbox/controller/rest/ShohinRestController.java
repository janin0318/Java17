package com.example.sandbox.controller.rest;

import com.example.sandbox.service.ShohinService;
import jakarta.websocket.server.PathParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

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
  
  @GetMapping("/shohin/{shohinId}")
  public String getShohinDetail(@PathVariable String shohinId) {
    return shohinService.getShohinDetail(shohinId).toString();
  }
  
  @GetMapping("/shohin")
  public String getShohinDetailByParam(@RequestParam String shohinId) {
    return shohinService.getShohinDetail(shohinId).toString();
  }
}

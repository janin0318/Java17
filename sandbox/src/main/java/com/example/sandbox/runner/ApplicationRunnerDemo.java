package com.example.sandbox.runner;

import com.example.sandbox.dto.Shohin;
import com.example.sandbox.service.ShohinService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ApplicationRunnerDemo implements ApplicationRunner {

  private final ShohinService shohinService;

  @Autowired
  public ApplicationRunnerDemo(ShohinService shohinService) {
    this.shohinService = shohinService;
  }

  @Override
  public void run(ApplicationArguments args) {
    List<Shohin> shohinList = shohinService.getAllShohin();
    log.info(shohinList.toString());
    List<String> shohinMei = shohinService.getAllShohinMei();
    log.info(shohinMei.toString());
  }
}

package com.example.sandbox.runner;

import com.example.sandbox.dto.Shohin;
import com.example.sandbox.service.ShohinService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
@Slf4j
public class ApplicationRunnerDefault implements ApplicationRunner {

  private final ShohinService shohinService;

  @Autowired
  public ApplicationRunnerDefault(ShohinService shohinService) {
    this.shohinService = shohinService;
  }

  @Override
  public void run(ApplicationArguments args) {
    List<Shohin> shohinList = shohinService.getAllShohin();
    log.info(shohinList.toString());
    List<String> shohinMei = shohinService.getAllShohinMei();
    log.info(shohinMei.toString());
    Shohin shohin = shohinService.getShohinDetail("0001");
    log.info(shohin.toString());
  }
}

package com.example.sandbox.runner;

import com.example.sandbox.dto.Shohin;
import com.example.sandbox.service.ShohinService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("docker")
@Slf4j
public class ApplicationRunnerDocker implements ApplicationRunner {

  private final ShohinService shohinService;

  ApplicationRunnerDocker(ShohinService shohinService) {
    this.shohinService = shohinService;
  }

  @Override
  public void run(ApplicationArguments args) {
    log.info("Profile : dockerの実施");
    List<Shohin> shohinList = shohinService.getAllShohin();
    log.info(shohinList.toString());
    List<String> shohinMei = shohinService.getAllShohinMei();
    log.info(shohinMei.toString());
    Shohin shohin = shohinService.getShohinDetail("0002");
    log.info(shohin.toString());
  }
}

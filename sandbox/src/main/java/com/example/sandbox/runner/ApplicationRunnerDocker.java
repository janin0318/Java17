package com.example.sandbox.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("docker")
@Slf4j
public class ApplicationRunnerDocker implements ApplicationRunner {

  @Override
  public void run(ApplicationArguments args) {
    log.info("Profile : dockerの実施");
  }
}

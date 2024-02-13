package com.example.sandbox.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class SandboxAspect {

  @Before("execution(* com.example.sandbox.controller.*.*(..))")
  public void adviceController() {
    log.info("コントローラ処理前のログ");
  }
}

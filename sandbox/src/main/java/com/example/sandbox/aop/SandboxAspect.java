package com.example.sandbox.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class SandboxAspect {

  @Before("execution(* com.example.sandbox.controller.*.*(..))")
  public void adviceBeforeController(JoinPoint jp) {
    log.info("{} メソッド 処理開始", jp.getSignature().getName());
  }

  @AfterReturning("execution(* com.example.sandbox.controller.*.*(..))")
  public void adviceAfterReturningController(JoinPoint jp) {
    log.info("{} メソッド 処理が正常終了", jp.getSignature().getName());
  }

  @Before("execution(* com.example.sandbox.controller.rest.*.*(..))")
  public void adviceBeforeRestController() {
    log.info("RESTコントローラ処理前のログ");
  }

  @AfterReturning("execution(* com.example.sandbox.controller.rest.*.*(..))")
  public void adviceAfterReturningRestController() {
    log.info("RESTコントローラ処理正常終了後のログ");
  }

  @Before("execution(* com.example.sandbox.runner.*.*(..))")
  public void adviceBeforeApplicationRunner() {
    log.info("ApplicationRunner処理前のログ");
  }

  @AfterReturning("execution(* com.example.sandbox.runner.*.*(..))")
  public void adviceAfterReturningApplicationRunner() {
    log.info("ApplicationRunner処理正常終了後のログ");
  }

  @Before("execution(* com.example.sandbox.mapper.*.*(..))")
  public void adviceBeforeMapper(JoinPoint jp) {
    log.info("Mapper処理前のログ 引数: {}", jp.getArgs());
  }

  @AfterReturning("execution(* com.example.sandbox.mapper.*.*(..))")
  public void adviceAfterReturningMapper() {
    log.info("ApplicationRunner処理正常終了後のログ");
  }
}

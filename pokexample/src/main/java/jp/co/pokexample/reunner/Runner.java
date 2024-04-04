package jp.co.pokexample.reunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class Runner implements ApplicationRunner {

  private final StringRedisTemplate redisTemplate;

  @Autowired
  public Runner(StringRedisTemplate redisTemplate) {
    this.redisTemplate = redisTemplate;
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println(redisTemplate.opsForValue().get("フシギダネ"));
  }
}

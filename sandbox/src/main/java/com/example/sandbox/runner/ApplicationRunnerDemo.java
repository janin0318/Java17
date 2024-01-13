package com.example.sandbox.runner;

import com.example.sandbox.dto.Shohin;
import com.example.sandbox.repository.SampleLikeMapper;
import com.example.sandbox.repository.ShohinMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class ApplicationRunnerDemo implements ApplicationRunner {

  private final SampleLikeMapper samplelikeMapper;
  private final ShohinMapper shohinMapper;

  @Autowired
  public ApplicationRunnerDemo(SampleLikeMapper samplelikeMapper, ShohinMapper shohinMapper) {
    this.samplelikeMapper = samplelikeMapper;
    this.shohinMapper = shohinMapper;
  }

  @Override
  public void run(ApplicationArguments args) {
    List<String> sampleLikes = samplelikeMapper.findAll();

    log.info("findAllの結果出力開始");
    for (String sampleLike : sampleLikes) {
      log.info(sampleLike);
    }
    log.info("findAllの結果出力終了");

    String result = samplelikeMapper.findByPk("abcddd");
    log.info("findByPkの結果: " + result);

    List<Shohin> shohins = shohinMapper.findAll();
    for (Shohin shohin : shohins) {
      log.info(shohin.toString());
    }
    System.exit(0);
  }
}

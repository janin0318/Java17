package jp.co.pokexample.service.impl;

import java.util.Objects;
import jp.co.pokexample.entity.PokemonBase;
import jp.co.pokexample.exception.PokemonNotExistException;
import jp.co.pokexample.service.PokemonService;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Log4j2
public class PokemonServiceImpl implements PokemonService {

  private final RestTemplate restTemplate;

  public PokemonServiceImpl(RestTemplateBuilder restTemplateBuilder) {
    this.restTemplate = restTemplateBuilder.build();
  }

  @Override
  public PokemonBase buildPokemon(String id) {
    if (Objects.isNull(id) || id.isBlank()) {
      throw new PokemonNotExistException("ポケモンが見つかりません。");
    }

    return PokemonBase.buildPokemonById(restTemplate, Integer.parseInt(id));
  }
}

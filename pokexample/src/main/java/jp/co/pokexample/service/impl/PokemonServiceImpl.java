package jp.co.pokexample.service.impl;

import java.util.Objects;
import jp.co.pokexample.entity.PokemonBase;
import jp.co.pokexample.exception.PokemonNotExistException;
import jp.co.pokexample.service.PokemonService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class PokemonServiceImpl implements PokemonService {

  @Override
  public PokemonBase buildPokemon(String id) {
    if (Objects.isNull(id) || id.isBlank()) {
      throw new PokemonNotExistException("ポケモンが見つかりません。");
    }
    return PokemonBase.buildPokemonById(Integer.parseInt(id));
  }
}

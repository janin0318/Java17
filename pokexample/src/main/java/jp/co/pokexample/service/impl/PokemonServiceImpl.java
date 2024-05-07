package jp.co.pokexample.service.impl;

import jp.co.pokexample.entity.PokemonBase;
import jp.co.pokexample.service.PokemonService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@Log4j2
public class PokemonServiceImpl implements PokemonService {

  @Override
  public PokemonBase buildPokemon(String id) {

    return PokemonBase.buildPokemonById(Integer.parseInt(id));
  }
}

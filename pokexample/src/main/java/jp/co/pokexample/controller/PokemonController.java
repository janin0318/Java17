package jp.co.pokexample.controller;

import java.util.Objects;
import jp.co.pokexample.entity.PokemonBase;
import jp.co.pokexample.exception.PokemonNotExistException;
import jp.co.pokexample.service.PokemonService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Log4j2
public class PokemonController {

  private final PokemonService pokemonService;

  PokemonController(PokemonService pokemonService) {
    this.pokemonService = pokemonService;
  }

  @GetMapping("/id/{id}")
  public String getById(@PathVariable("id") String id, Model model) {
    PokemonBase pokemonBase = pokemonService.buildPokemon(id);

    // 図鑑番号のポケモンが存在しない場合は、エラーページに飛ばす。
    if (Objects.isNull(pokemonBase)) {
        throw new PokemonNotExistException("ポケモンが見つかりません。");
    }

    model.addAttribute("pokemon", pokemonBase);
    return "pokemon";
  }

  @ExceptionHandler(PokemonNotExistException.class)
  public String pokemonNotExist() {
    return "error";
  }
}

package jp.co.pokexample.controller;

import jp.co.pokexample.service.PokemonService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    model.addAttribute("pokemon", pokemonService.buildPokemon(id));
    return "pokemon";
  }
}

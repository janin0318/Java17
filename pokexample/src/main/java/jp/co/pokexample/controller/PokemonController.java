package jp.co.pokexample.controller;

import jp.co.pokexample.entity.Pokemon;
import jp.co.pokexample.service.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

  private final PokemonService pokemonService;

  PokemonController(PokemonService pokemonService) {
    this.pokemonService = pokemonService;
  }

  @GetMapping("/id/{id}")
  public String getById(@PathVariable String id) {
    Pokemon pokemon = pokemonService.buildPokemon(id);
    return pokemon.getBase().getName() + pokemon.getBase().getOfficialArtwork();
  }
}

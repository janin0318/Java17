package jp.co.pokexample.controller;

import com.github.oscar0812.pokeapi.models.pokemon.Pokemon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

  @GetMapping("/{id}")
  public String getById(@PathVariable String id) {
    Pokemon pokemon = Pokemon.getById(Integer.parseInt(id));
    return pokemon.getName();
  }
}

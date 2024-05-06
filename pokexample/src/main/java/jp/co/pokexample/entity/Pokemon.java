package jp.co.pokexample.entity;

import java.util.Objects;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Pokemon {

  private final PokemonBase base;
  private final PokemonSpecies species;

  public Pokemon(PokemonBase base, PokemonSpecies species) {
    this.base = base;
    this.species = species;
  }

}

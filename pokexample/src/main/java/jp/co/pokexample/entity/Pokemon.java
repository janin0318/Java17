package jp.co.pokexample.entity;

import lombok.Getter;

@Getter
public class Pokemon {

  private PokemonBase base;
  private PokemonSpecies species;

  public Pokemon(PokemonBase base, PokemonSpecies species) {
    this.base = base;
    this.species = species;
  }
}

package jp.co.pokexample.entity;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PokemonSpecies {
  private final Integer id;
  private final String name;
  private final String nameJp;

  public PokemonSpecies(JsonNode jsonNode) {
    this.id = null;
    this.name = null;
    this.nameJp = createNameJp(jsonNode);
  }

  private String createNameJp(JsonNode jsonNode) {
    return null;
  }
}

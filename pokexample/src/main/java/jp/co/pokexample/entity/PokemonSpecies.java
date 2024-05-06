package jp.co.pokexample.entity;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PokemonSpecies {
  private int id;
  private String nameJp;
  private String nameEn;
  private String imagePath;

  public PokemonSpecies(JsonNode jsonNode) {
    this.nameJp = createNameJp(jsonNode);
  }

  private String createNameJp(JsonNode jsonNode) {
    return null;
  }

  private String createImagePath(JsonNode jsonNode) {
    return null;
  }
}

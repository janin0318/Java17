package jp.co.pokexample.entity;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PokemonBase {
  private final int id;
  private final String name;
  private final String officialArtwork;

  public PokemonBase(JsonNode jsonNode) {
    this.id = jsonNode.get("id").asInt();
    this.name = jsonNode.get("name").asText();
    this.officialArtwork = createOfficialArtwork(jsonNode);
  }

  private String createOfficialArtwork(JsonNode jsonNode) {
    return jsonNode.get("sprites").get("other").get("official-artwork").get("front_default")
        .asText();
  }
}

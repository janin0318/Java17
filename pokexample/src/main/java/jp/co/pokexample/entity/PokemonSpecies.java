package jp.co.pokexample.entity;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.Objects;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PokemonSpecies {
  private final Integer id;
  private final String nameJp;
  private final String flavorText;

  public PokemonSpecies(JsonNode jsonNode) {
    this.id = jsonNode.get("id").asInt();
    this.nameJp = createNameJp(jsonNode);
    this.flavorText = createFlavorText(jsonNode);
  }

  private String createNameJp(JsonNode jsonNode) {
    JsonNode nameNode = getJaJsonNode(jsonNode.get("names"));
    return nameNode.get("name").asText();
  }

  private String createFlavorText(JsonNode jsonNode) {
    JsonNode flavorTextNode = getJaJsonNode(jsonNode.get("flavor_text_entries"));
    return flavorTextNode.get("flavor_text").asText();
  }

  /**
   * 日本語のJsonNodeを返す
   * @param jsonNode
   * @return
   */
  private JsonNode getJaJsonNode(JsonNode jsonNode) {
    for (int i = 0; i < jsonNode.size(); i++) {
      String lang = jsonNode.get(i).get("language").get("name").asText();
      if (Objects.equals(lang, "ja")) {
        return jsonNode.get(i);
      }
    }
    return null;
  }
}

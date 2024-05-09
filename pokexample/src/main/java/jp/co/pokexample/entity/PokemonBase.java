package jp.co.pokexample.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Objects;
import jp.co.pokexample.exception.PokemonNotExistException;
import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * ポケモンベース
 */
@Getter
@ToString
public class PokemonBase {

  // ポケモンが存在しない場合に使用する。
  public static final PokemonBase NOT_FOUND = null;

  private static final String POKE_API_URL = "https://pokeapi.co/api/v2/pokemon/";

  // ポケモン図鑑番号
  private final int id;
  // 名前（英名）
  private final String name;
  // 公式画像（フロント）
  private final String officialArtwork;
  // ポケモンの種類
  private final PokemonSpecies species;

  public static PokemonBase buildPokemonById(Integer pokemonId) {
    return new PokemonBase(pokemonId);
  }

  private PokemonBase(Integer pokemonId) {
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> pokeApiResult = restTemplate.getForEntity(POKE_API_URL + pokemonId,
        String.class);

    if (!Objects.equals(pokeApiResult.getStatusCode(), HttpStatus.OK)) {
      throw new PokemonNotExistException();
    }

    ObjectMapper mapper = new ObjectMapper();

    JsonNode jsonNode;

    try {
      jsonNode = mapper.readTree(pokeApiResult.getBody());
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }

    this.id = jsonNode.get("id").asInt();
    this.name = jsonNode.get("name").asText();
    this.officialArtwork = createOfficialArtwork(jsonNode);
    this.species = new PokemonSpecies(pokemonId);
  }

  private String createOfficialArtwork(JsonNode jsonNode) {
    return jsonNode.get("sprites").get("other").get("official-artwork").get("front_default")
        .asText();
  }
}

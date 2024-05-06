package jp.co.pokexample.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jp.co.pokexample.entity.Pokemon;
import jp.co.pokexample.entity.PokemonBase;
import jp.co.pokexample.service.PokemonService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonServiceImpl implements PokemonService {

  private static final String BASE_URL = "https://pokeapi.co/api/v2/pokemon/";
  private static final String SPECIES_URL = "https://pokeapi.co/api/v2/pokemon-species/";

  @Override
  public Pokemon buildPokemon(String id) {

    RestTemplate restTemplate = new RestTemplate();

    ResponseEntity<String> baseResult = restTemplate.getForEntity(BASE_URL + id, String.class);
    ResponseEntity<String> speciesResult = restTemplate.getForEntity(SPECIES_URL + id,
        String.class);

    ObjectMapper mapper = new ObjectMapper();

    JsonNode baseJsonNode;
    JsonNode speciesJsonNode;

    try {
      baseJsonNode = mapper.readTree(baseResult.getBody());
    } catch (JsonProcessingException exception) {
      throw new RuntimeException(exception);
    }

    PokemonBase base = new PokemonBase(baseJsonNode);

    return new Pokemon(base, null);
  }
}

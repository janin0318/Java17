package jp.co.pokexample.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jp.co.pokexample.entity.Pokemon;
import jp.co.pokexample.entity.PokemonBase;
import jp.co.pokexample.entity.PokemonSpecies;
import jp.co.pokexample.service.PokemonService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Log4j2
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
      log.warn("baseJsonNodeでJsonProcessingExceptionが発生しました。");
      throw new RuntimeException(exception);
    }

    PokemonBase base = new PokemonBase(baseJsonNode);

    try {
      speciesJsonNode = mapper.readTree(speciesResult.getBody());
    } catch (JsonProcessingException exception) {
      log.warn("speciesJsonNodeでJsonProcessingExceptionが発生しました。");
      throw new RuntimeException(exception);
    }

    PokemonSpecies species = new PokemonSpecies(speciesJsonNode);

    return new Pokemon(base, species);
  }
}

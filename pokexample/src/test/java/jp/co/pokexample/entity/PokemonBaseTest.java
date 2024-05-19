package jp.co.pokexample.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import jp.co.pokexample.exception.PokemonNotExistException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@ExtendWith(MockitoExtension.class)
class PokemonBaseTest {

  @Mock
  private RestTemplate restTemplate;

  private static final String POKEMON_BASE_JSON = "src/test/java/jp/co/pokexample/entity/PokemonBase.json";
  private static final String POKEMON_SPECIES_JSON = "src/test/java/jp/co/pokexample/entity/PokemonSpecies.json";

  @Test
  public void PokeApiの戻り値が200以外の場合() {
    ResponseEntity<String> responseEntity = new ResponseEntity<>("", HttpStatus.NOT_FOUND);
    Mockito.when(restTemplate.getForEntity(Mockito.anyString(), Mockito.eq(String.class)))
        .thenReturn(responseEntity);
  }

  @Test
  public void 正常系() throws IOException {
    ObjectMapper mapper = new ObjectMapper();

    JsonNode pokemonBaseNode = mapper.readTree(new File(POKEMON_BASE_JSON));
    ResponseEntity<String> pokemonBaseResult = new ResponseEntity<>(pokemonBaseNode.toString(),
        HttpStatus.OK);
    Mockito.when(restTemplate.getForEntity("https://pokeapi.co/api/v2/pokemon/1", String.class))
        .thenReturn(pokemonBaseResult);

    JsonNode pokemonSpeciesNode = mapper.readTree(new File(POKEMON_SPECIES_JSON));
    ResponseEntity<String> pokemonSpecies = new ResponseEntity<>(pokemonSpeciesNode.toString(),
        HttpStatus.OK);
    Mockito.when(
            restTemplate.getForEntity("https://pokeapi.co/api/v2/pokemon-species/1", String.class))
        .thenReturn(pokemonSpecies);

    PokemonBase result = null;

    assertEquals(result.getId(), 1);
    assertEquals(result.getName(), "bulbasaur");
    assertEquals(result.getOfficialArtwork(), "front_default");
  }
}

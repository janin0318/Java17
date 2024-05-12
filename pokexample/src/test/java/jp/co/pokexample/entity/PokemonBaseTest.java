package jp.co.pokexample.entity;

import static org.junit.jupiter.api.Assertions.assertThrows;

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

  @Test
  public void PokeApiの戻り値が200以外の場合() {
    ResponseEntity<String> responseEntity = new ResponseEntity<>("", HttpStatus.NOT_FOUND);
    Mockito.when(restTemplate.getForEntity(Mockito.anyString(), Mockito.eq(String.class)))
        .thenReturn(responseEntity);
    assertThrows(PokemonNotExistException.class,
        () -> PokemonBase.buildPokemonById(restTemplate, 1));
  }



}

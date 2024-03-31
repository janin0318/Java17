package jp.co.pokexample.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Setter(AccessLevel.PRIVATE)
@Getter
@ToString
public class Pokemon {

  private int id;
  private String name_jp;
  private String name_en;

  public static Pokemon getByName(String name) {
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> result = restTemplate.getForEntity("https://pokeapi.co/api/v2/pokemon-species/" + name, String.class);
    return new Pokemon(null);
  }

  public static Pokemon getById(int id) {
    return new Pokemon(null);
  }

  private Pokemon(String result) {

  }
}

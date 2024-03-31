package jp.co.pokexample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PokemonController {

  @GetMapping("/{id}")
  public String getById(@PathVariable String id) {
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> response = restTemplate.getForEntity("https://pokeapi.co/api/v2/pokemon-species/" + id, String.class);
    String responseBody = response.getBody();

    System.out.println(responseBody);
    return null;
  }
}

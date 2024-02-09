package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("id", "1");
    map.put("name", "tanaka");
    System.out.println(map);
  }
}
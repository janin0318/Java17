package org.example.rpg.magic;

import java.util.HashMap;
import java.util.Map;
import org.example.rpg.magic.base.Magic;
import org.example.rpg.magic.type.MagicType;

public class Main {

  public static void main(String[] args) {
    Map<MagicType, Magic> magics = new HashMap<>();
    magics.put(MagicType.fire, new Fire());
    magics.put(MagicType.shiden, new Shiden());
    magics.put(MagicType.hellFire, new HellFire());
    System.out.println(magics.get(MagicType.fire).name());
  }
}

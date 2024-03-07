package org.example.rpg.character;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Member {

  private final String name;
  private final int hitPoint;
  private final int magicPoint;
  private final List<StateType> stateTypes;

  public Member(String name, int hitPoint, int magicPoint) {
    if (Objects.isNull(name) || name.isEmpty()) {
      throw new IllegalArgumentException("名前を設定してください。");
    }
    if (hitPoint < 0) {
      throw new IllegalArgumentException("HitPointは0以上の値を設定してください。");
    }
    if (magicPoint < 0) {
      throw new IllegalArgumentException("MagicPointは0以上の値を設定してください。");
    }
    this.name = name;
    this.hitPoint = hitPoint;
    this.magicPoint = magicPoint;
    this.stateTypes = new ArrayList<>();
    stateTypes.add(StateType.alive);
  }

  public String getName() {
    return this.name;
  }

  public int getHitPoint() {
    return this.hitPoint;
  }

  public int getMagicPoint() {
    return this.magicPoint;
  }

  public boolean isAlive() {
    return stateTypes.contains(StateType.alive);
  }

  public void addStateType(StateType stateType) {
    this.stateTypes.add(stateType);
  }

  public void remoteStateType(StateType stateType) {
    this.stateTypes.remove(stateType);
  }

}

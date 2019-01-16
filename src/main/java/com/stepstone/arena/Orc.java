package com.stepstone.arena;

public class Orc extends Creature {

  public Orc() {
    super(drawRandomNumber(1, 6), drawRandomNumber(1, 6), drawRandomNumber(1, 6),
          drawRandomNumber(1, 6), drawRandomNumber(1, 6), drawRandomNumber(1, 6),
          drawRandomNumber(1, 6),
          drawRandomNumber(1, 6), CharacterType.ORC);
  }
}

package com.stepstone.arena;

public class Troll extends Creature {

  public Troll() {
    super(drawRandomNumber(1, 6), drawRandomNumber(1, 6), drawRandomNumber(1, 6),
          drawRandomNumber(1, 6), drawRandomNumber(1, 6), drawRandomNumber(1, 6),
          drawRandomNumber(1, 6),
          drawRandomNumber(1, 6), CharacterType.TROLL);
  }
}

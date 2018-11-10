package com.stepstone.arena;

public class Human extends Creature {

  public Human() {
    super(drawRandomNumber(1, 6), drawRandomNumber(1, 6), drawRandomNumber(1, 6),
          drawRandomNumber(1, 6), drawRandomNumber(1, 6), drawRandomNumber(1, 6),
          drawRandomNumber(1, 6),
          drawRandomNumber(1, 6), CharacterType.HUMAN);
  }
}

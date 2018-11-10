package com.stepstone.arena;

public class Dwarf extends Creature {

  public Dwarf() {
    super(drawRandomNumber(1, 6), drawRandomNumber(1, 6), drawRandomNumber(1, 6),
          drawRandomNumber(1, 6), drawRandomNumber(1, 6), drawRandomNumber(1, 6),
          drawRandomNumber(1, 6),
          drawRandomNumber(1, 6), CharacterType.DWARF);
  }
}

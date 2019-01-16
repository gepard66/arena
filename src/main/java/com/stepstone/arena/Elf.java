package com.stepstone.arena;

public class Elf extends Creature {

  public Elf() {
    super(drawRandomNumber(1, 6), drawRandomNumber(1, 6), drawRandomNumber(1, 6),
          drawRandomNumber(1, 6), drawRandomNumber(1, 6), drawRandomNumber(1, 6),
          drawRandomNumber(1, 6),
          drawRandomNumber(1, 6), CharacterType.ELF);
  }
}

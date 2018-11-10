package com.stepstone.arena;

import org.springframework.util.Assert;

import java.util.List;
import java.util.Random;

public class CreateCharacterService {

  CharacterType characterType;
  List<Creature> creatureList;

  public List<Creature> createCreature(int numberOfCreatures) {
    switch (characterType) {
      case HUMAN:
        addCreaturesToList(numberOfCreatures, new Human());
        break;
      case HALFING:
        addCreaturesToList(numberOfCreatures, new Halfing());
        break;
      case TROLL:
        addCreaturesToList(numberOfCreatures, new Troll());
        break;
      case ORC:
        addCreaturesToList(numberOfCreatures, new Orc());
        break;
      case DWARF:
        addCreaturesToList(numberOfCreatures, new Dwarf());
        break;
      case ELF:
        addCreaturesToList(numberOfCreatures, new Elf());
        break;
      default:
        creatureList.add(null);
    }
    return creatureList;

  }

  private void addCreaturesToList(int numberOfCreatures, Creature creature) {
    for (int i = 0; i < numberOfCreatures; i++) {
      creatureList.add(creature);
    }
  }


//  public static int drawRandomNumber(int minimum, int maximum) {
//    Random rn = new Random();
//    return rn.nextInt(maximum - minimum + 1) + minimum;
//  }

}

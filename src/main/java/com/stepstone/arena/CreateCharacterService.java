package com.stepstone.arena;

import static com.stepstone.arena.Creature.drawRandomNumber;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateCharacterService {

  private CharacterType characterType;
  private List<Creature> creatureList;

  public List<Creature> createCreature(int numberOfCreatures) {
    for (int i = 0; i < numberOfCreatures; i++) {
      switch (getRandomCharacter()) {
        case HUMAN:
          creatureList.add(new Human());
          break;
        case HALFING:
          creatureList.add(new Halfing());
          break;
        case TROLL:
          creatureList.add(new Troll());
          break;
        case ORC:
          creatureList.add(new Orc());
          break;
        case DWARF:
          creatureList.add(new Dwarf());
          break;
        case ELF:
          creatureList.add(new Elf());
          break;
        default:
          System.out.println("Wrong type of creature");
      }
    }
    return creatureList;
  }

  private CharacterType getRandomCharacter() {
    return CharacterType.values()[drawRandomNumber(0, CharacterType.values().length - 1)];
  }

}

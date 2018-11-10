package com.stepstone.arena;

import lombok.Getter;

import java.util.Random;

public abstract class Creature {

  @Getter
  private Integer strength;
  @Getter
  private Integer dexterity;
  @Getter
  private Integer initiative;
  @Getter
  private Integer velocity;
  @Getter
  private Integer endurance;
  @Getter
  private Integer numberOfAttacks;
  @Getter
  private Integer numberOfDodges;
  @Getter
  private Integer lifePoints;
  @Getter
  private CharacterType characterType;

  public Creature(Integer strength, Integer dexterity, Integer initiative, Integer velocity,
                  Integer endurance, Integer numberOfAttacks, Integer numberOfDodges,
                  Integer lifePoints, CharacterType characterType) {
    this.strength = strength;
    this.dexterity = dexterity;
    this.initiative = initiative;
    this.velocity = velocity;
    this.endurance = endurance;
    this.numberOfAttacks = numberOfAttacks;
    this.numberOfDodges = numberOfDodges;
    this.lifePoints = lifePoints;
    this.characterType = characterType;
  }

  @Override
  public String toString() {
    return "Creature{" +
           "strength=" + strength +
           ", dexterity=" + dexterity +
           ", initiative=" + initiative +
           ", velocity=" + velocity +
           ", endurance=" + endurance +
           ", numberOfAttacks=" + numberOfAttacks +
           ", numberOfDodges=" + numberOfDodges +
           ", lifePoints=" + lifePoints +
           '}';
  }

  public static int drawRandomNumber(int minimum, int maximum) {
    Random rn = new Random();
    return rn.nextInt(maximum - minimum + 1) + minimum;
  }
}

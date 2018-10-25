package com.stepstone.arena;

public abstract class Creature {
  private Integer strength;
  private Integer dexterity;
  private Integer initiative;
  private Integer velocity;
  private Integer endurance;
  private Integer numberOfAttacks;
  private Integer numberOfDodges;
  private Integer lifePoints;

  public Creature(Integer strength, Integer dexterity, Integer initiative, Integer velocity,
                  Integer endurance, Integer numberOfAttacks, Integer numberOfDodges,
                  Integer lifePoints) {
    this.strength = strength;
    this.dexterity = dexterity;
    this.initiative = initiative;
    this.velocity = velocity;
    this.endurance = endurance;
    this.numberOfAttacks = numberOfAttacks;
    this.numberOfDodges = numberOfDodges;
    this.lifePoints = lifePoints;
  }

  public Integer getStrength() {
    return strength;
  }

  public Integer getDexterity() {
    return dexterity;
  }

  public Integer getInitiative() {
    return initiative;
  }

  public Integer getVelocity() {
    return velocity;
  }

  public Integer getEndurance() {
    return endurance;
  }

  public Integer getNumberOfAttacks() {
    return numberOfAttacks;
  }

  public Integer getNumberOfDodges() {
    return numberOfDodges;
  }

  public Integer getLifePoints() {
    return lifePoints;
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
}

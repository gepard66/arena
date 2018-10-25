package com.stepstone.arena;

public enum CharacteresTypes {


//  private final static String ELF = "ELF";
//  private final static String HUMAN = "HUMAN";
//  private final static String HALFING = "HALFING";
//  private final static String TROLL = "TROLL";
//  private final static String ORC = "ORC";
//  private final static String DWARF = "DWARF";
//
//  private Integer strength;
//  private Integer dexterity;
//  private Integer initiative;
//  private Integer velocity;
//  private Integer endurance;
//  private Integer numberOfAttacks;
//  private Integer numberOfDodges;
//  private Integer lifePoints;
//
//  CharacteresTypes(Integer strength, Integer dexterity, Integer initiative, Integer velocity,
//                   Integer endurance, Integer numberOfAttacks, Integer numberOfDodges,
//                   Integer lifePoints) {
//    this.strength = strength;
//    this.dexterity = dexterity;
//    this.initiative = initiative;
//    this.velocity = velocity;
//    this.endurance = endurance;
//    this.numberOfAttacks = numberOfAttacks;
//    this.numberOfDodges = numberOfDodges;
//    this.lifePoints = lifePoints;
//  }

  ELF("ELF"),
  HUMAN("HUMAN"),
  HALFING("HUMAN"),
  TROLL("TROLL"),
  ORC("ORC"),
  DWARF("DWARF");

  private String characterType;

  CharacteresTypes(String characterType) {
    this.characterType = characterType;
  }

  public String getCharacterType() {
    return characterType;
  }




}

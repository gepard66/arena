package com.stepstone.arena.interfaces;

import com.stepstone.arena.Creature;

public interface CreatureFunctions {

  int attack(Creature creature);
  void dodge(int potentialDamage, Creature attacker);

}

package com.stepstone.arena;

import org.springframework.boot.SpringApplication;

public class ArenaApplication {

  public static void main(String[] args) {
    SpringApplication.run(ArenaApplication.class, args);

    Elf elf = new Elf(100,100,100,100,100,100,100,100);
    System.out.print(elf);

  }
}

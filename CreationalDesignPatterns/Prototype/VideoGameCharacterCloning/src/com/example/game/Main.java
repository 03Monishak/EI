package com.example.game;

public class Main {
    public static void main(String[] args) {
        // Create an initial character
        GameCharacter warrior = new GameCharacter("Warrior", 100, 50);
        warrior.addAbility("Sword Attack");
        warrior.addItem("Sword");

        // Create a prototype factory
        CharacterFactory characterFactory = new CharacterFactory(warrior);

        // Clone the warrior character
        GameCharacter clonedWarrior1 = characterFactory.createClone();
        GameCharacter clonedWarrior2 = characterFactory.createClone();

        // Modify the clones
        clonedWarrior1.addAbility("Shield Block");
        clonedWarrior2.addItem("Health Potion");

        // Display the original and cloned characters
        System.out.println("Original Character: " + warrior);
        System.out.println("Cloned Character 1: " + clonedWarrior1);
        System.out.println("Cloned Character 2: " + clonedWarrior2);
    }
}
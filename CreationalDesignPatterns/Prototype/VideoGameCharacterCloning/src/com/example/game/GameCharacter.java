package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class GameCharacter implements Cloneable {
    private String name;
    private int health;
    private int attackPower;
    private List<String> abilities;
    private List<String> inventory;

    public GameCharacter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.abilities = new ArrayList<>();
        this.inventory = new ArrayList<>();
    }

    public void addAbility(String ability) {
        abilities.add(ability);
    }

    public void addItem(String item) {
        inventory.add(item);
    }

    // Prototype pattern: implementing the clone method
    @Override
    protected GameCharacter clone() throws CloneNotSupportedException {
        GameCharacter cloned = (GameCharacter) super.clone();
        cloned.abilities = new ArrayList<>(this.abilities);
        cloned.inventory = new ArrayList<>(this.inventory);
        return cloned;
    }

    @Override
    public String toString() {
        return "Character: " + name + ", Health: " + health + ", Attack Power: " + attackPower + 
               ", Abilities: " + abilities + ", Inventory: " + inventory;
    }

    // Getters and setters omitted for brevity
}
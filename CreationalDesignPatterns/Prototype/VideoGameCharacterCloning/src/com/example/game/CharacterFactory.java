package com.example.game;

public class CharacterFactory {
    private GameCharacter prototype;

    public CharacterFactory(GameCharacter prototype) {
        this.prototype = prototype;
    }

    public GameCharacter createClone() {
        try {
            return prototype.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Clone not supported: " + e.getMessage());
            return null;
        }
    }

    public void setPrototype(GameCharacter prototype) {
        this.prototype = prototype;
    }
}
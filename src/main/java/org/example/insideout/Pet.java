package org.example.insideout;

import org.example.interfaces.Feed;

public class Pet extends Emotion implements Feed {
    public Pet(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println("estoy comiendo");
    }
}

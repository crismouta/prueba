package org.example;

import org.example.insideout.Character;
import org.example.insideout.Emotion;
import org.example.insideout.Human;
import org.example.insideout.Pet;
import org.example.user.User;

public class Main {
    public static void main(String[] args) {
        Emotion joy = new Emotion("Joy", 11, "yellow");
        Emotion sadness = new Emotion("Sadness", 11,"blue");

        System.out.println(joy.introduce());
        System.out.println(sadness.introduce());

        Human rilley = new Human("Rilley" , 13, "Main Character");

        System.out.println(rilley.introduce());
        joy.wakeUp();

        Pet dog = new Pet("pepito", 11, "blue");

        dog.wakeUp();


    }
}
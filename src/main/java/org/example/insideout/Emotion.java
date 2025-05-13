package org.example.insideout;

import org.example.interfaces.DailyRoutine;

public class Emotion extends Character implements DailyRoutine {
    private String color;

    public Emotion(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String introduce() {
        return "Hola soy una emocion";
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void wakeUp() {
        System.out.println("Me he despertado");
    }


    @Override
    public void sleep() {
        System.out.println("Estoy durmiendo");
    }
}

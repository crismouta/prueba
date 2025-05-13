package org.example.insideout;

import org.example.interfaces.DailyRoutine;
import org.example.interfaces.Feed;

public class Human extends Character implements DailyRoutine, Feed {
    private String role;

    public Human(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    @Override
    public String introduce() {
        return "Hi i'm " + super.getName() + " , I'm " + super.getAge() + " years old." + " and I'm " + this.role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void wakeUp() {
        System.out.println("Me he despertado");
    }


    @Override
    public void sleep() {
        System.out.println("Estoy durmiendo");
    }

    @Override
    public void eat() {
        System.out.println("Estoy comiendo");
    }
}

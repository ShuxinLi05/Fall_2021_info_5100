package com.company;

public class Rat extends Animal implements iSwim{

    public Rat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(" I am a rat and I am speaking");

    }


    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}

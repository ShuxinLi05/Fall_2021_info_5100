package com.company;

public class Husky extends Dog{

    public Husky(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("I am a Husky and I am barking");
    }

}

package com.company;

public abstract class Dog extends Animal implements iSwim{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("I am barking");
    }

    @Override
    public void swim(){
        System.out.println("I am swimming");
    }

    @Override
    public void eat(){
        System.out.println("I am a dog and I am eating");
    }

    public void getFamily(){
        System.out.println("I am from wolf family");
    }
}

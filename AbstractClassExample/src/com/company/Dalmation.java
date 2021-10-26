package com.company;

public class Dalmation extends Dog{

    public Dalmation(String name) {
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("I am a dalmatian and I don't bark much");
    }


}

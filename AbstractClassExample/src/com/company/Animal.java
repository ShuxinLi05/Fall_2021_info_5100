package com.company;

public abstract class Animal {
    String name;

    public void eat(){
        System.out.println("I am an animal and I am eating food");

    }
    public abstract void speak();//if not sure what to implement
    //{
        // default values:
        //System.out.println(getClass().toString() + " is speaking");
        //System.out.println("I am is speaking");
    //}

    //public abstract void swim();

    public Animal(String name){
        this.name = name;

    }

}

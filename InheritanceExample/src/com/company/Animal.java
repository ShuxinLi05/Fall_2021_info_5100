package com.company;
// integer values: 0, 1, 2
enum animalType {mammal, fish, reptile};

public class Animal {

    public animalType type;

    private String name;
    private int age;
    private double weight;
    private boolean isMammal;
    public boolean isVegetarian;


    public Animal(String name, int age, double weight, boolean isMammal, boolean isVegetarian){

    }

    /*
    public Animal(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

     */
    public void eat(){
        System.out.println("Animal eat function called give me tasty treat");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

}

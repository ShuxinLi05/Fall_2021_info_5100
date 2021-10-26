package com.company;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Dog dog = new Dalmation("dalmatian");
        dog.speak();
        dog.getFamily();

        Animal cat = new Cat("cat");
        cat.speak();

        Animal bird = new Bird("bird");
        bird.speak();

        Fish fish = new Fish("fish");
        fish.speak();
        fish.swim();

        zoo.listAnimals.add(dog);
        zoo.listAnimals.add(cat);
        zoo.listAnimals.add(bird);
        zoo.listAnimals.add(fish);

        Animal animal = zoo.listAnimals.get(3);
        System.out.println(animal.getClass().toString());

        Fish fish1 = (Fish) zoo.listAnimals.get(3);
        fish1.swim();

    }
}

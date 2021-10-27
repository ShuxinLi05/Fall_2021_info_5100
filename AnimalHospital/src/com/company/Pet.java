package com.company;

public abstract class Pet {

    private String name;
    private String ownerName;
    private String color;

    public Pet(String name, String ownerName, String color){
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString(){
        return "Pet name = " + this.name + " Owner = " + this.ownerName + " Color = " + this.color;
    }

    public abstract String eat();
    public abstract String sound();

}

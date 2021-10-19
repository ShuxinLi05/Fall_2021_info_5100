package com.company;

public abstract class Car {
    private String name;
    private Wheels wheels;
    private GearBox gearBox;
    private Seats seats;
    private String modelName;
    private int speed;

    public void setSpeed(int speed) {this.speed = speed;}

    public String getName() {
        return name;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public Seats getSeats() {
        return seats;
    }

    public String getModelName() {
        return modelName;
    }

    public abstract int getSpeed();

    public void setName(String name) { this.name = name; }

    public Car(String modelName, boolean isAutomatic, int numSeats, boolean hasLeather){
        this.name = name;
        this.modelName = modelName;
        wheels = new Wheels(17);
        gearBox = new GearBox(isAutomatic);
        seats = new Seats(numSeats, hasLeather);
    }

}

// Has - a relationship
// is a relationship
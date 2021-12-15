package com.company;

public class Roomba implements iRobot{

    int[][] room;
    int[] location;
    Main.Direction dir;

    public Roomba(int[][] room){
        this.room = room;
        location = new int[]{0, 0};
        dir = Main.Direction.DOWN;
    }

    @Override
    public boolean move() {
        return false;
    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void clean() {

    }
}

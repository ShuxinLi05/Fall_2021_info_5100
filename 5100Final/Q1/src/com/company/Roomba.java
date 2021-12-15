package com.company;

public class Roomba implements iRobot{
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    int[][] room;
    int[] location;
    Direction dir;
    int i, j;

    public Roomba(int[][] room){
        this.room = room;
        location = new int[]{0, 0};
        dir = Direction.DOWN;
    }

    @Override
    public boolean move() {
        if(dir == Direction.DOWN){
            if(i+1> room.length || room[i+1][j] == -1) return false;

        } else if(dir == Direction.UP){
            if(i-1<0 || room[i-1][j] == -1) return false;

        }else if(dir == Direction.RIGHT){
            if (j+1>room[0].length||room[i][j+1]==-1) return false;

        }else if(dir == Direction.LEFT){
            if(j-1>room[0].length||room[i][j-1] == -1) return false;
        }
        return true;

    }

    @Override
    public void turnLeft() {
        this.dir = Direction.LEFT;

    }

    @Override
    public void turnRight() {
        this.dir = Direction.RIGHT;

    }

    @Override
    public void clean() {

    }
}

package com.company;

public class Main {

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static void main(String[] args) {
        int[][] room1 = {
                {0,0,0,0},
                {0,0,0,0},
                {-1,0,0,0},
                {0,0,-1,0}
        };
        Roomba robot = new Roomba(room1);
    }
}

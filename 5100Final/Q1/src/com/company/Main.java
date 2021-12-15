package com.company;

public class Main {



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

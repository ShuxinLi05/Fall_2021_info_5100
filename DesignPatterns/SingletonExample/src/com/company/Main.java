package com.company;

public class Main {

    public static void main(String[] args) {

        //Projector proj1 = new Projector(); since it's private, so it's not working
        Projector proj = Projector.getInstance();
        Projector proj1 = Projector.getInstance();

        proj.name = "Projector in room whitbey";

        System.out.println(proj1.name);

    }
}

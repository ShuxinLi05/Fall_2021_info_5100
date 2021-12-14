package com.company;

public class Main {

    public static void main(String[] args) {
/*
        System.out.println(Thread.currentThread().getName());

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of cores " + cores);

 */
        RunnableClass simple = new RunnableClass();
        Thread th = new Thread(simple);
        th.setName("Shuxin's Thread");
        th.start();

        System.out.println("I am inside " + Thread.currentThread().getName() + " Thread");

    }
}

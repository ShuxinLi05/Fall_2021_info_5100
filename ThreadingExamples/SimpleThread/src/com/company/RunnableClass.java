package com.company;

public class RunnableClass implements Runnable{ // Runnable is interface
    @Override
    public void run() {
        System.out.println("I am inside " + Thread.currentThread().getName());
    }
}

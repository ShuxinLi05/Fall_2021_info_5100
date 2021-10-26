package com.company;

public class Projector {

    private static Projector _instance;

    private Projector(){} //No one can create instance through default constructor

    private static Object obj = new Object();

    public String name = "Default";

    public static Projector getInstance(){

        if(_instance == null){ // double locking
            synchronized (obj){ // only for creating one instance
                if(_instance == null){
                    _instance = new Projector();
                }
            }
        }
        return _instance;

    }
    /*
    public static void sampleFunction(int value){
        // Debug.log("Inside Sample Function " + "value = " + value + UserID)
    }
     */

}

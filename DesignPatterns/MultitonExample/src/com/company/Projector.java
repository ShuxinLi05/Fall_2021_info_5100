package com.company;

import java.util.HashMap;
import java.util.UUID;

public class Projector {

    static HashMap<Integer, Projector> projectors = new HashMap<>();



    private Projector(){
        //UUID = UUID.randomUUID();
    }

    //private static UUID projectorHardwareID;

    private static Object obj = new Object();

    public static Projector getProject(Integer id){

        if(projectors.containsKey(id) == false){
            synchronized (obj){
                if(projectors.containsKey(id) == false){
                    projectors.put(id,new Projector());
                }
            }
        }
        return projectors.get(id);

    }
}

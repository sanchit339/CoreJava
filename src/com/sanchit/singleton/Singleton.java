package com.sanchit.singleton;

public class Singleton {
    private Singleton (){

    }

    private static Singleton instance;

    // we restrict the function creating the new class by this function
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}


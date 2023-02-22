package com.sanchit.interfaces.extendDemo2;

public interface A {
    static void greeting(){ //  the static methods must always have the body
        System.out.println(" hey i am static method");
    }

    default void fun(){
        System.out.println("I am in A");
    }
}

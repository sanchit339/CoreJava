package com.sanchit.interfaces;

// if we want to create a car entity with the given function
// we can get those function with ( implements ) method
public class Car implements Engine , Brake{
    @Override
    public void brake() {
        System.out.println("abs method this is brake ");
    }

    @Override
    public void start() {
        System.out.println("this car starts too");
    }

    @Override
    public void stop() {
        System.out.println("this car stops too");
    }

    @Override
    public void acc() {
        System.out.println("this class can accelerate too");
    }
}

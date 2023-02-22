package com.sanchit.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.brake();
        // done at the run time

        // car.start(); // if we want media start, but we are getting engine start

        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.startMusic();
        niceCar.upgradeEngine();
        // this will start after the engine upgrade
        niceCar.start();
    }
}

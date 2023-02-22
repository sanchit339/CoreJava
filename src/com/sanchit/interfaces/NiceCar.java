package com.sanchit.interfaces;

public class NiceCar {
    // the car will have the engine of its own so kept private
    private Engine engine;
    // the car will also have its music player
    private Media player = new CDPlayer();


    public NiceCar() {
        engine = new PowerEngine();
    }

    // personalized engine
    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    //
    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    // suppose Upgrading the Engine
    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }

    // this is regarding the music player
    public void startMusic(){
        player.start();
    }

}

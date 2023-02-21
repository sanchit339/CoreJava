package com.sanchit.properties.inheritance;

// extend keyword allows to add some additional functions
public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    // cannot be overriden
    static void greeting(){
        System.out.println("this is greeting from weight class");
    }

    public BoxWeight(double side , double weight){
        super(side);
        this.weight = weight;
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // to call the parent class constructor
        // use to initialize the value present in parent class
        this.weight = weight;
    }
}

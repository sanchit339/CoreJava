package com.sanchit.properties.inheritance;

public class BoxColor extends BoxWeight{
    String color;

    public BoxColor(){
        this.color = "white";
    }

    public BoxColor( double side , double weight , String color){
        super(weight , side);
        this.color = color;
    }
}

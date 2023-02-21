package com.sanchit.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Shapes  circle = new Circles();
        Shapes square = new Square();

        circle.area();
        square.area(); // the output depends on the object type
        // as here it is square the method of square will be called
        // all the method/elements that are available to shape that will be available to --> the provided object

    }
}

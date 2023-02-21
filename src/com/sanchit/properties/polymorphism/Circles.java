package com.sanchit.properties.polymorphism;

public class Circles extends Shapes{
    //this will run when the object of circle is created
    // hence it is overriding the parent method
    @Override // this is just the annotation
    void area(){
        System.out.println("area is pie * r^2");
    }

    // this will not be called with the over-ridden method
    // as it is not available in
    void side(){
        System.out.println("lol this is side");
    }
}

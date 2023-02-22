package com.sanchit.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;

    // let's declare some static method
    // the static method cannot be overridden
    // as it does not depend on the object it will not (overridden) by the child class/ obj
    // inherited
    static void greeting(){
        System.out.println("this is static method , greeting ");
    }
    // override dep on obj
    // static don't dep on obj
    // so static cannot be overridden

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    //cube
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }
}


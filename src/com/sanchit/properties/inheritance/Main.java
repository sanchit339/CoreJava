package com.sanchit.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//
//        System.out.println(box.l + " " + box.w + " " + box.h);
//
//        BoxWeight bw1 = new BoxWeight();
//        System.out.println(bw1.h + " " + bw1.weight);

        BoxWeight bw4 = new BoxWeight(2, 4, 6, 8);

        Box box5 = new BoxWeight(2, 3, 5, 7);
        System.out.println(box5); // this cannot access the weight as weight is not property of super class

        // there are many variable in both parent and child classes
        // you are given access to variable that are in the ref type i.e BoxWeight
        // hence you should have access to the weight variable

        // this alo means that once you are trying to access should also be initialised
        // here , when the obj itself is of parent class , how will you call the constructor of child class
        // BoxWeight bw6 = new Box(); this cannot happen

        BoxPrice BP1 = new BoxPrice(2 , 3, 5, 7, 9);
        BoxPrice bp2 = new BoxPrice();
        System.out.println(bp2);

        BoxColor bc1 = new BoxColor(3 , 5 , "red");
        System.out.println("box color property " + bc1.color + " ");

        Box bx1 = new BoxWeight();
        BoxWeight.greeting(); // this will call from the weight class
        bx1.greeting(); // this will call from parent class
    }
}

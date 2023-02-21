package com.sanchit.staticMethod;

public class Main {
    public static void main(String[] args) {
        Human sanchit = new Human(12,"sanchit ingale" , 0 );
        Human dj = new Human(12,"dj rajesh " , 0 );

        System.out.println(sanchit.population); //the convention is different
        System.out.println(Human.population);
        System.out.println(dj.population);

        // we cant call it here coz its non-static  {Gives an Error}
//        greeting();

    }

    static void fun(){
        // greeting();  you cannot use it because it requires instance
        // but function you are using does not depend on the instance

        // to use it in the static method
        Main obj = new Main();
        obj.greeting(); // you cannot access non-static stuff without referencing their instances in
        // static context
    }

    void fun2(){
        greeting();
    }

    // suppose we define a non-static method
    void greeting(){
        System.out.println("hello world");
    } // we know as the non-static method belongs to an object
}

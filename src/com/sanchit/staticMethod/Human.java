package com.sanchit.staticMethod;

public class Human {
    int age;
    String name;
    int salary;
    static int population; //common for all thus, it exists in the Human
    // so the static variable can be accessed before any object is created

    static void message(){
        System.out.println("hello world");
        //System.out.println(this.age); // as (this) requires object
    }

    public Human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population += 1; // static  methods are referenced like this
    }
}

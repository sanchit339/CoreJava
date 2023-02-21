package com.sanchit.Intro;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student();
        System.out.println(std1.rno);
        System.out.println(std1.name);

        // modify the value
        std1.rno = 10;
        std1.marks = 99;
        std1.name = "Sanchit";

        //accessing
        System.out.println(std1.name);

        // constructor
        std1.greeting(); // now here greeting will get the values from the student

        Student std2 = new Student();
        std2.greeting();

        std1.ChangeName("Dj rajesh");

        std1.greeting();

        // if we call obj without any argument it will pass coz empty one is present

        Student random = new Student(); // constructor with null value is present

        Student random1 = new Student(12,"dj",99) ; // here this-one constructor requires all the Necessary

        Student random2 = new Student(std1); // std1 is predefined the values of the std1 will be copied there (to random 2)
        System.out.println(random2.name);

        Student random3 = new Student(); // random3 call a empty constructor

        // here sanch is non-primitive datatype so it can be changed
        final A sanh  = new A("sanchit");
        sanh.name = "sanchit ingale";
        // sanh.num = 11; here error coz num is defined through the primitive data type and it is finalized

        A obj;
        // loop will create a new obj every time
//        for (int i = 0; i < 100000000; i++) {
//            obj = new A("Random Name");
//        }
        obj = new A("sanchit");
        System.out.println(obj);
    }
}

class Student {
    int rno ;
    String name ;
    float marks;
    // constructor
    void greeting(){
        System.out.println("Hello and welcome " + name);
    }

    void ChangeName(String name){
        this.name = name;  // here this refers to the constructor coz there is confusion between the name and the function -> name
    }

    // constructor OverLoading

    Student (Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    // pre-defined values for the constructor
    Student(){
        this(100 ,"default person " , 99);
    }

    // Student sanh = new Student(13, "sanchit ingale" , 99.0f)
    // here , this will be replaced with sanchit ingale
    Student(int roll , String name , int marks){
        this.rno = roll; // this will refer to the templets roll number
        this.name = name;
        this.marks = marks;
    }

}

class A {
    final int num = 10;
    String name;

    // created a constructor to call outside
    public A(String name) {
        this.name = name;
    }

    // when any class is freed the memory this is called
    // this will simulate the Garbage collection
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Obj is Distroyed");
    }
}

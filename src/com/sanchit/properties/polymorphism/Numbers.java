package com.sanchit.properties.polymorphism;

// static polymorphism
public class Numbers {

    // same name but different argument and variables
    double sum (double a , int b){
        return (a + b);
    }

    int sum(int a, int b , int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();  // just revising the concept
        num.sum(2 ,3); // you cannot call non-static inside static so firstly the obj (num) is created
        num.sum(2 , 3 , 4);
    }
}

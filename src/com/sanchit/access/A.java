package com.sanchit.access;

public class A {
    private int num;  // private will be accessed only in this file
    String name;
    int[] Arr;

    public int getNum() { // the getter is public this can be accessed anywhere
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name, int[] arr) {
        this.num = num;
        this.name = name;
        Arr = arr;
    }
}

package com.sanchit.staticMethod;

public class StaticInt {
    static int a = 2;
    static int b;

    // this will run only once when the class is loaded for the first time
    static {
        System.out.println("I am sanchit");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);  // here first the A is only set to  ' 2 '

        StaticInt.b += 3;

        StaticInt obj2 = new StaticInt();
        System.out.println(StaticInt.b); // the value updated
        System.out.println(StaticInt.a + " " + StaticInt.b);
    }
}

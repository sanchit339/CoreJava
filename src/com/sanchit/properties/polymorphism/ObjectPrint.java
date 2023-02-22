package com.sanchit.properties.polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num){
        this.num = num;
    }

    @Override // at run time it will be used
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj); // here the print will call the to string method but it is not defined in
    }
}

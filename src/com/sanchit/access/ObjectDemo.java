package com.sanchit.access;

public class ObjectDemo {

    int num;
    float val;

    public ObjectDemo(int num , float name){
        this.num = num;
        this.val = val;
    }

    // implemented these two
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(32  , 43.43f);
        ObjectDemo obj1 = new ObjectDemo(32 , 54.54f);

        if( obj == obj1 ){ // just check the obj
            System.out.println("obj is equal to obj1");
        }

        if( obj.equals(obj1)){ // check the values
            System.out.println("obj is equal to obj1");
        }

    }
}

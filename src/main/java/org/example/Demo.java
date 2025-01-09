package org.example;

public class Demo {
    void m1(){
        System.out.println("m1 method");
    }
    public static void main(String[] args) {

        Thread thread = new Thread();
        //thread added
        System.out.println(" thread started ");
        System.out.println(" thread "+thread.getName());
        Demo d = new Demo();
        d.m1();
        System.out.println(" thread stopped ");
    }
}

package org.example;


public interface FuntionalInterface {
    void m1();

    default void m3(){
        System.out.println("m3");
    }

    static void m2(){
        System.out.println("m2");
    }
}

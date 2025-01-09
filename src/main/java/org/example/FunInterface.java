package org.example;
import java.lang.FunctionalInterface;
public class FunInterface {
    @FunctionalInterface // annotation for functional interface
    interface FuncInterface {
        public int multiply(int a, int b);

    }
        public static void main(String args[]) {
            FuncInterface Total = (a, b) -> a*b;

           // FuncInterface totalSum = (c,d) -> c+d;
            // simple operation of multiplication of 'a' and 'b'
            System.out.println("Result: "+Total.multiply(30, 60));
        }

}

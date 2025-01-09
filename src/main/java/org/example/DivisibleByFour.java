package org.example;

public class DivisibleByFour {
    public static void main(String[] args) {
        boolean isDivisible = isPowerOfFour(64);
        System.out.println(" is Divisible ?" +isDivisible);
    }
    private static boolean isPowerOfFour(int n) {
//        if(n<1) return false;
//        if(n==1) return true;
//        if(n%4!=0) return false;
//        return isPowerOfFour(n/4);


        //return  ((n & (n-1))==0) && (n-1)%3==0;

        if(n<1) return false;
        while(n!=1){
            if(n%4!=0) return false;
            n=n/4;
        }
        return true;
    }
}

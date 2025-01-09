package org.example;

public class MissingNumber {
    public static void main(String[] args) {
        int missingNumber = missingNumber(new int[]{0, 1, 2, 3, 4, 6, 7, 8});
        System.out.println("the missing Number is "+missingNumber);
    }

    private static int missingNumber(int[] a) {
        int len = a.length;
        int result = len;
        for(int i=0;i<len;i++){
            result ^= (a[i]^i);
        }
        return result;
    }
}

package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] a = reversethearray(new int[]{1,2,3,4,5,6});
        String string1 = Arrays.toString(a);
        System.out.println(string1);
    }

    private static int[] reversethearray(int[] nums) {
        int start =0,end=nums.length-1;
        int temp;
        while(start<end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = start;
            start++;
            end--;
        }
        return nums;
    }
}

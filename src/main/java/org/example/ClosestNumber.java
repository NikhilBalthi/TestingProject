package org.example;

public class ClosestNumber {
    public static void main(String[] args) {

        int[] nums = {-4,-2,-1,4,3,5};
        System.out.println("the number closes to zero is "+findClosestToZero(nums));
    }

    private static int findClosestToZero(int[] nums) {
        if(nums==null || nums.length==0){
            throw new IllegalArgumentException("Array must not be empty");
        }
        int closest = nums[0];
        for(int num:nums){
            if(Math.abs(num)<Math.abs(closest)){
                closest = num;
            } else if (Math.abs(num) == Math.abs(closest) && num>closest) {
                closest = num;
            }
        }
        return closest;
    }
}

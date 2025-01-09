package org.example;

//This problem was asked in google.
public class MaximumSubArray {
    public static void main(String[] args) {
        int nums[] = {1,-2,-4,5,6,-1};
        int result = maxsum(nums);
        System.out.println("the result is "+result);
    }

    private static int maxsum(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        for(int i=1;i<nums.length;i++){
            maxEndingHere = Math.max(nums[i],maxSoFar+nums[i]);

            maxSoFar = Math.max(maxSoFar,maxEndingHere);

        }
        return maxSoFar;
    }

}

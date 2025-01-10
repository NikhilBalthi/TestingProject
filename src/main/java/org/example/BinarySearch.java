package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int result = search(new int[]{1,-1,3},3);
        System.out.println("the result is "+result);
    }
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(target==nums[mid]) return mid;
            if(target<mid) right = mid-1 ;
            else left = mid+1;
        }
        return -1;
    }
}

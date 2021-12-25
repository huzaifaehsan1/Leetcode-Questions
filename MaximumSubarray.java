// Given an integer array nums, find the contiguous subarray (containing at least one number) 
// which has the largest sum and return its sum.
// A subarray is a contiguous part of an array.

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum<0) sum = 0;
        }
        
        return max;
    }

    public static void main(String[] args) {
        int answer = maxSubArray(new int[] {1,2,6,5,4,30,21});
    }
}
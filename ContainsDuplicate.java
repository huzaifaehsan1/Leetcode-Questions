// Given an integer array nums, return true if any value appears at least twice in the array
// and return false if every element is distinct.
// Input: nums = [1,2,3,1]
// Output: true

import java.util.*;

class Solution {

    public static void main(String[] args){

        System.out.println(containsDuplicate(new int[]{1,2,3}));

    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                return true;
            }
        }

        return false;
    }
}
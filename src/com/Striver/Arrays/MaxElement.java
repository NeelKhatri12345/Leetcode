package com.Striver.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] nums = {3,6,1,19,21,2,};
        largestElement(nums);
    }
    static void largestElement(int[] nums) {
        int max =nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[max] < nums[i]) {
                max = i;
            }
        }
        System.out.println(nums[max]);
    }
}

package com.Striver.Arrays;

import java.util.Arrays;

public class Sort_0_1_2 {
    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int low=0;
        int mid =0;
        int high = nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp1 = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp1;
                high--;

            }
        }
    }
}
package com.Striver.Arrays;

class Solution {
    public static  void secondLargestElement() {

        int nums[] = {8,8,7,6,5};
        int large =0;
        int second_large = 0;
//        if(nums.length<2){
//            return -1;
//        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>large){
                second_large = large;
                large= nums[i];
            }
            else if(nums[i]>second_large && nums[i]!=large){
                second_large = nums[i];
            }
        }
        System.out.println(second_large);
    }

    public static void main(String[] args) {
        secondLargestElement();
    }
}

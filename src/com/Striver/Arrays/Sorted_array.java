package com.Striver.Arrays;

public class Sorted_array {
    public static void main(String[] args) {
        int nums[] = {1,3,2,4,5};
        System.out.println(sort(nums));

    }
    static boolean sort(int nums[]){
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
    }
}

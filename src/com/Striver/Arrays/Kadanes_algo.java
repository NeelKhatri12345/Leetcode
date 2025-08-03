package com.Striver.Arrays;

import java.util.Arrays;

public class Kadanes_algo {
    public static void main(String args[]) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        kadane(arr,n);
    }

    public static void kadane(int []arr, int n){
        int max =Integer.MIN_VALUE;
        int sum =0;
        int start=0;
        int ansStart=-1;
        int ansEnd=-1;

        for(int i=0;i<n;i++){
            if(sum==0)
                start =i;

            sum +=arr[i];

            if(sum>max){
                max = sum;
                ansStart =start;
                ansEnd =i;
            }

            if(sum<0)
                sum=0;
        }

        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }
}

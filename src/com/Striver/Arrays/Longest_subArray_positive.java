package com.Striver.Arrays;

public class Longest_subArray_positive {
    public static void main(String[] args) {
        int []arr={2,3,5};
        int n = arr.length;
        int sum=5;
        longest_subArray(arr,n,sum);
    }

    public static void longest_subArray(int []arr, int n, int sum){
        int  len =0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int s =0;
                for(int k=i;k<=j;k++){
                    s = s+arr[k];
                }
                if(s==sum){
                    len = Math.max(len,j-i+1);
                }
            }
        }
        System.out.println(len);
    }
}

package com.Striver.Arrays;

import java.sql.SQLOutput;

public class Linear_Search {
    public static void main(String[] args) {
        int []arr= {5, 4, 3, 2, 1};
        int num = 5;
        search(arr,num);
    }
    static void search(int[] arr, int num){
        for(int i=0;i<arr.length;i++){
            if(num ==arr[i]){
                System.out.println(i);
            }
        }
    }
}

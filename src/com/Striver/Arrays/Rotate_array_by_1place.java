package com.Striver.Arrays;

import java.util.Arrays;

public class Rotate_array_by_1place {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,3,4,9,7,0};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int []arr){
        int temp = arr[0];

        for(int i=1;i<arr.length;i++){
            arr[i-1]= arr[i];
        }
        arr[arr.length-1]=temp;
    }
}

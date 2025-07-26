package com.Striver.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Array_DPlaces {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of d : ");
        int d = sc.nextInt();

        left_rotate(arr,d);
        System.out.println(Arrays.toString(arr));
    }

    public static void left_rotate(int []arr,int d){
        //
            d = d%arr.length;
            int []temp = new int[arr.length];
            for(int i=0; i<d; i++){
                temp[i] = arr[i];
            }

            //shifting
            for(int i=d;i<arr.length;i++){
                arr[i-d] = arr[i];
            }

            for(int i=arr.length-d;i< arr.length;i++){
                arr[i] = temp[i-(arr.length-d)];
            }
    }
}

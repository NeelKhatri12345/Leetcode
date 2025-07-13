package com.Striver.Hashing;

import java.util.*;

public class element_frequency {
    public static void main(String[] args) {
        int arr[] = {10,5,15,10,5,1,15,10,10,10};
        int n = arr.length;
        element_frequency( arr,n);
    }

    public static void element_frequency(int arr[],int n){
        boolean visited[] = new boolean[n];

        for(int i=0 ; i<n; i++){
            if(visited[i] == true)
                continue;

            int count = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " repeats " + count + " times");

        }
    }
}

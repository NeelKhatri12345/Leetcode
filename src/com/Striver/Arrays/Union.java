package com.Striver.Arrays;

import java.util.ArrayList;

public class Union {
    public static void main(String[] args) {
        int []arr1 = {1, 2, 3, 4, 5,  7, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        int n1 = arr1.length;
        int n2 = arr2.length;
        union(arr1,arr2,n1,n2);
    }

    //Brute Force
//    public static void union(int arr1[], int arr2[]){
//        int n1 = arr1.length;
//        int n2 = arr2.length;
//
//        HashSet<Integer> set = new HashSet<>();
//
//        for(int i=0;i<n1;i++){
//            set.add(arr1[i]);
//        }
//        for(int i=0;i<n2;i++){
//            set.add(arr2[i]);
//        }
//
//        ArrayList<Integer> union = new ArrayList<>();
//        for(int it:set){
//            union.add(it);
//        }
//       for(int i=0;i< union.size();i++){
//           System.out.print(union.get(i) + " ");
//       }

    public static void union(int []arr1, int []arr2,int n1,int n2){

        int i=0;
        int j=0;

        ArrayList<Integer> union = new ArrayList<>();

        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                if(union.size()==0 || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);

                }
                i++;
            }
            else{
                if(union.size()==0 || union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);

                }
                j++;
            }
        }

        while(i<n1){
            if(union.size()==0 || union.get(union.size()-1)!=arr1[i]) {
                union.add(arr1[i]);

            }
            i++;
        }
        while(j<n2){
            if(union.size()==0 || union.get(union.size()-1)!=arr2[j]) {
                union.add(arr2[j]);

            }
            j++;
        }

        for(int k=0;k< union.size();k++){
            System.out.print(union.get(k) + " ");
        }
    }

}

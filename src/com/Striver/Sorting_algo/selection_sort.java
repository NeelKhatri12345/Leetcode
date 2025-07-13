package com.Striver.Sorting_algo;

import java.util.Arrays;

public class selection_sort {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int []arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]= sc.nextInt();
//        }
//        selection_sort(arr,n);
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
//
//   static void selection_sort(int arr[], int n){
//        for(int i=0;i<=n-2;i++){
//            int min = i;
//            for(int j=i;j<=n-1;j++){
//                if(arr[j]<arr[min]){
//                    min =j;
//                }
//            }
//
//            int temp = arr[min];
//            arr[min] = arr[i];
//            arr[i] = temp;
//        }
//    }

    public static void main(String[] args) {
        int [] arr= {3,1,5,4,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getmax(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int []arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getmax(int[] arr, int start, int end){
        int max = start;
        for(int i = start;i <= end;i++){
            if(arr[max]<arr[i])
                max = i;
        }
        return max;
    }
}

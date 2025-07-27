package com.Striver.Arrays;

import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 3, 5, 6, 6, 7};

        int n1 = arr1.length;
        int n2 = arr2.length;

        intersection(arr1, arr2, n1, n2);
    }

    public static void intersection(int[] arr1, int[] arr2, int n1, int n2) {
        int i = 0, j = 0;
        ArrayList<Integer> intersection = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) {
                // Avoid adding duplicates
                if (intersection.size() == 0 || intersection.get(intersection.size() - 1) != arr1[i]) {
                    intersection.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        for (int val : intersection) {
            System.out.print(val + " ");
        }
    }
}

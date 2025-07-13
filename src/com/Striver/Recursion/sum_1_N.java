package com.Striver.Recursion;

import java.util.Scanner;

public class sum_1_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no : ");
        int n = sc.nextInt();

        sum_1_N ob = new sum_1_N();
        ob.s(n,0);
    }

    void s(int i,int sum){
        if(i<1) {
            System.out.println(i);
            return;
        }

        s(i-1,sum+i);
    }
}

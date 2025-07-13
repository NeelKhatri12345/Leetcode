package com.Striver.Recursion;

import java.util.Scanner;

public class linearly_1_N {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt();

        linearly_1_N ob = new linearly_1_N();
        ob.s(n,n);

    }

    void s(int i,int n){
        if(i<1)
            return;

        s(i-1,n);
        System.out.println(i);
    }
}

package com.Striver.Recursion;

import java.util.Scanner;

public class linearly_N_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt();

        linearly_N_1 ob = new linearly_N_1();
        ob.s(1,n);

    }

    void s(int i,int n){
        if(i>n)
            return;

        s(i+1,n);
        System.out.println(i);
    }
}

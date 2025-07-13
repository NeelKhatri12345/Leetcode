package com.Striver.Recursion;

import java.util.Scanner;

public class printing_names {
    public void s(int i,int n){
        if(i>n)
            return;

        System.out.println("Neel");
       s(i+1,n);
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        printing_names p = new printing_names();
         p.s(1,n);
    }
}
package com.Striver.Math;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int count = 0;
        for(int i =1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("It is a Prime No.");
        }
        else{
            System.out.println("It is not a Prime No.");
        }
    }
}

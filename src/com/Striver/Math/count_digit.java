package com.Striver.Math;

import java.util.Scanner;

import static java.lang.Math.*;

public class count_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");

        int n = sc.nextInt();
        int count = 0;
//        while(n>0){
//            //int lastdigit = n%10;
//            n = n/10;
//            count++ ;
//        }

        count = (int)Math.log10(n) +1;

        System.out.println(count);
    }
}

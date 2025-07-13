package com.Striver.Math;

import java.sql.SQLOutput;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int rev = 0;
        int lastdigit = 0;

        while(n>0){
             lastdigit = n%10;
             n = n/10;
             rev = (rev  * 10) + lastdigit;
        }
        System.out.println(rev);
    }
}

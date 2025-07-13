package com.Striver.Math;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = sc.nextInt();

        int lastdigit = 0;
        int rev = 0;
        int dup = n;

        while(n>0){
            lastdigit = n%10;
            n = n/10;
            rev = (rev*10) + lastdigit;
        }

        if(dup == rev ){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}

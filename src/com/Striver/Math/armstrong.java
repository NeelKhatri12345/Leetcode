package com.Striver.Math;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = sc.nextInt();

        int lastdigit = 0;
        int sum = 0;
        int duplicate = n ;

        while(n>0){
            lastdigit = n%10;
            sum = sum + (lastdigit*lastdigit*lastdigit);
            n = n/10;
        }
        if(sum == duplicate){
            System.out.println("it is an Armstrong number");
        }
        else{
            System.out.println("It is not an Armstrong number");
        }
    }
}

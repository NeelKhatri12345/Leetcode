package com.Striver.Hashing;

import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();

        int hash[] = new int[256];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)]++;
        }

        System.out.println("Enter no. of queries");
        int q = sc.nextInt();
        while(q-- !=0){
            System.out.println("Enter Character : ");
            char c = sc.next().charAt(0);
            System.out.println(hash[c]);
        }
    }
}

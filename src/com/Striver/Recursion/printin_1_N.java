package com.Striver.Recursion;

//public class printin_1_N {
//    int count = 1;
//
//    void s(){
//        System.out.println(count);
//        count++;
//
//        if(count==6)
//            return;
//
//        s();
//    }
//
//    public static void main(String[] args){
//        printin_1_N ob =new printin_1_N();
//        ob.s();
//    }
//}

import java.util.Scanner;

public class printin_1_N {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. ");
        int n = sc.nextInt();

        printin_1_N ob = new printin_1_N();
        ob.s(1,n);
    }

    void s(int i,int n){
        if(i>n)
            return;

        System.out.println(i);

        s(i+1,n);
    }
}
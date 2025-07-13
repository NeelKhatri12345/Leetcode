package com.Striver.Recursion;

//public class printing_N_1 {
//    int count = 5;
//
//    void s(){
//        System.out.println(count);
//        count--;
//
//        if(count<1)
//            return;
//
//        s();
//    }
//
//    public static void main(String[] args){
//        printing_N_1 ob =new printing_N_1();
//        ob.s();
//    }
//}


import java.util.Scanner;

public class printing_N_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. ");
        int n = sc.nextInt();

        printin_1_N ob = new printin_1_N();
        ob.s(n, n);
    }

    void s(int i, int n) {
        if (i < 1)
            return;

        System.out.println(i);

        s(i - 1, n);
    }
}

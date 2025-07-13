package com.Neel;

import java.util.Scanner;

class file {
    void s(int pow, int No) {
        for (int i = 1; i < pow; i++) {
            int Pow = No * No;
        }
    }

}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("power");
        int pow = sc.nextInt();

        System.out.println("no");
        int No = sc.nextInt();

        file ob = new file();
        ob.s(pow,No);
    }

}
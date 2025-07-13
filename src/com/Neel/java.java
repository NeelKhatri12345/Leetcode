package com.Neel;

import java.util.Scanner;

class B_Multiply_by_2_divide_by_6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int count =0;
        for(int i=0;i<t;i++){
            int n = sc.nextInt();

            while(n!=1){
                if(n%6==0){
                    count++;
                }
                else if(n%6!=0){
                    n = n*2;
                    count++;
                }
                else{
                    System.out.println(-1);
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
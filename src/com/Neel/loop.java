package com.Neel;

class PatternDemo{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }//for j
            System.out.println();
        }//outer for i
    }
}



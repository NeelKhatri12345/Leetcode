class loops{
    public static void main(String[] args) {
        int n = 5;

        /*for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int i=0;i<=n;i++){
            for(int j = 0; j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }*/
    
        // for(int i=0; i<=n;i++){
        //     for(int j=0;j<i;j++){
        //         if( (i+j)%2 ==0){
        //             System.out.print("0");
        //         }
        //         else{
        //             System.out.print("1");
        //         }
        //     }
        //     System.out.println(" ");
        // }
        
    //     for(int i=0;i<=n;i++){
    //         for(int j=0;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //     for(int k = 0; k<2*i-1;k++){
    //         System.out.print("*");
    //     }
    //     System.out.println(" ");
    //     }
     
        // for(int i=0; i<=n; i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=0;k<=n-i-1;k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }
        // int space = 2*(n-1);
        // for(int i = 1;i<=n; i++){  
        //     //numbers 
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     // spaces
        //     for(int j =1;j<=space;j++){
        //         System.out.print(" ");
        //     }
        //     //numbers
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println(" ");
        //     space -=2;
        // }
        
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println(" ");
        }
    }
}


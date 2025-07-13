import java.util.Scanner;

public class A_Elephant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc. nextInt();

        int [] steps = {5, 4, 3, 2, 1};
        int count = 0;

        for(int i=0;i<steps.length;i++){
           while(x >= steps[i]){
                x -= steps[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
import java.util.Scanner;

public class A_Army {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];
        for (int i = 1; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();

        int total = 0;
        for (int i = a; i < b; i++) {
            total += arr[i];
        }
        System.out.println(total);
    }
}
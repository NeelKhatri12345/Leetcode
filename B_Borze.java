import java.util.Scanner;

public class B_Borze {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        StringBuilder result = new StringBuilder();

        for(int i=0;i<s.length();){
            if(s.charAt(i) == '.'){
                result.append("0");
                i++;
            }
            else if(s.charAt(i)== '-' && s.charAt(i+1) == '.'){
                result.append("1");
                i=i+2;
            }
            else if (s.charAt(i) == '-' && s.charAt(i+1) == '-'){
                result.append("2");
                i=i+2;
            }
        }
        System.out.println(result.toString());
    }
}
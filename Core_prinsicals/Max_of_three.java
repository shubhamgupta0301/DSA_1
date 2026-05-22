import java.util.*;
public class Max_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 =sc.nextInt();
        String max = (num1>num2 && num1>num3)? "num1":((num2>num1 && num1>num3)? "num2":"num3");  // Nester Ternary oparatopr
        // This workes a if it is a  if else statement but it is more concise and easy to read
        System.out.println(max);
        sc.close();
    }
}

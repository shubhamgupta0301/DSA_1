import java.util.Scanner;

public class Age_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age  = sc.nextInt();
        System.out.println(age>=18? "Eligible":"Not eligible"); // Ternary operator to check  age>18 or not
        //This is usefull to make code readable and concise
        sc.close();
    }
}

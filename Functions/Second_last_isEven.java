import java.util.*;

public class Second_last_isEven {
    public static boolean isEven(int num){
        if(num % 2 == 0)return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int second_last = (num /10) %10;
        System.out.println(isEven(second_last)? "Second last digit is even" : "Second last digit is odd");
        sc.close();
    }

}

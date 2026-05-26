import java.util.*;

public class BinaryToDecimal {
    public static int Binary_Decimal(int num){
        int decimal = 0;
        int power = 1;
        while(num > 0){
            int rem  = num%10;
            decimal += rem * power;
            power *= 2;
            num /= 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int num = sc.nextInt();
        System.out.println(Binary_Decimal(num));
        sc.close();


    }
}

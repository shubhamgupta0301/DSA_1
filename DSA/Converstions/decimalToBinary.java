import java.util.*;

public class decimalToBinary {
    public static int decimal_Bunary(int num){
        int binary = 0;
        int power = 1;
        while(num > 0 ){
            int rem = num %2 ;
            binary  = binary + rem * power;
            power = power  *10;
            num = num / 2;
        }
        return binary;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int num = sc.nextInt();
        System.out.println(decimal_Bunary(num));
        sc.close();
    }
}

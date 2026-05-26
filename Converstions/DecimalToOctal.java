

import java.util.*;

public class DecimalToOctal {
    public static int decimal_Octal(int num){
        int Octal = 0;
        int power = 1;
        while(num > 0 ){
            int rem = num %8 ;
            Octal  = Octal + rem * power;
            power = power  *10;
            num = num / 8;
        }
        return Octal;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int num = sc.nextInt();
        System.out.println(decimal_Octal(num));
        sc.close();
    }
}


// Need Corrections
import java.util.Scanner;

public class decimalToHex {
    public static void decimal_Hex(int num){
        int [] hex = new int[100];
        int i=0;

        while(num > 0){
            hex[i] = num % 16;
            num = num / 16;
            i++;
        }
        for(int j = i-1 ; j>=0 ;j--){
            if(hex[j] <10){
                System.out.print(hex[j]);
            }
            else{
                char ch = (char)(hex[j] - 10 + 'A');
                System.out.print(ch);
            }
        }

        return ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int num = sc.nextInt();
        decimal_Hex(num);
        sc.close();
    }
    
}

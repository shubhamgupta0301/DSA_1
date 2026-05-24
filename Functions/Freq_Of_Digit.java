import java.util.*;

public class Freq_Of_Digit {
    public int countDigit(int num , int dig){
        int count = 0;
        while(num > 0){
            int rem = num % 10;
            if(rem == dig){//If the lasrt digit is equal to the given digit, then we will increase the count by 1
                count++;
            }
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter a digit to count: ");
        int dig = sc.nextInt();
        Freq_Of_Digit obj = new Freq_Of_Digit();
        int result = obj.countDigit(num, dig);
        System.out.println("The frequency of digit  in number is: " + result);
        sc.close();
    }
}

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int reverse = 0; 
        int temp = num; // store the original no.
        // Logic
        // if original no. = reverse no. then it is a palindrome
        while(num>0){
            reverse = reverse*10 + num%10;
            num  = num/10;
        }
        System.out.println(reverse);
        System.out.println(temp == reverse? "Palindrome":"Not Palindrome"); // check palindrom condition
        sc.close();
    }
}

import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev= 0; // To store the reversed number
        while(num>0){
            rev = rev*10 + num%10; //Get the last digit and add it to the rev No.
            num = num/10; // Remove the last digit
        }
        System.out.println(rev);
        sc.close();
    }
    
}

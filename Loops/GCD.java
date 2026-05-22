import  java.util.*;
public class GCD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int min = Math.min(num1,num2); //return the minimum of 2 no.
        int gcd= 1;
        System.out.println(min);
        for(int i =2 ; i<min ; i++){ 
            if(num1 %i==0 && num2%i==0){ // If  i / num1 and i / num2 then i is a common factor
                gcd = i ; // Update the gcd to i
            }
        }
        System.out.println(gcd);
        sc.close();

        }
}
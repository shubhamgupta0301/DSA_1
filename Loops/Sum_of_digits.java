import  java.util.*;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n= sc.nextInt();
        int sum =0;
        while(n>0){ // Loop will run until n becomes 0
            sum= sum+ n%10; // Get the last digit of n and add it to sum
            n = n/10; // Remove the last digit of n
        }
        System.out.println(sum);
         

        sc.close();
        }
    } 


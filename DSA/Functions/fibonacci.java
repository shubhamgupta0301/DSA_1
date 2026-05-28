import java.util.*;
public class fibonacci {
    public static void fibo(int num){
        int start =0 , next = 1;
        for(int i = 0; i < num; i++){
            System.out.print(start + " ");
            int sum = start + next;
            start = next;
            next = sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci series: ");
        int num = sc.nextInt();
        fibo(num);
        sc.close();
    }
}

import  java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int c = sc.nextInt();
        // int f= (c * 9 / 5) + 32;
        // System.out.println(f);
        // int cout = (f-32)*5/9;
        // System.out.println(cout);
        //int n = sc.nextInt();   
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int num3 =sc.nextInt();
        // String max = (num1>num2 && num1>num3)? "num1":((num2>num1 && num1>num3)? "num2":"num3");
        // System.out.println(max);
        // int age  = sc.nextInt();
        // System.out.println(age>=18? "Eligible":"Not eligible");

        int n= sc.nextInt();
        int sum =0;
        while(n>0){
            sum= sum+ n%10;
            n = n/10;
        }
        System.out.println(sum);
         

        sc.close();
        }
    } 


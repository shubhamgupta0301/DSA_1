import java.util.*;
public class statment {
    public void ageChecker(int age){
        if(age<18 && age>0){
            System.out.println("You are a minor");
        }
        else if(age>=18 && age<40){
            System.out.println("You are an adult");
        }
        else if(age>=40){
            System.out.println("You are a senior citizen");
        }
        else{
            System.out.println("Invalid age");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a,b;
        // System.out.print("Enter first number: ");
        // a= sc.nextInt();
        // System.out.print("Enter second number: ");
        // b= sc.nextInt();
        // System.out.print("Enter operation: ");
        // String s= sc.next();
        // switch(s){
        //     case "add":
        //         System.out.println(String.format("%.2f", (double)(a+b)));
        //         break;
        //     case "sub":
        //         System.out.println(a-b);
        //         break;
        //     case "mul":
        //         System.out.println(a*b);
        //         break;
        //     case "div":
        //         System.out.println(String.format("%.2f", (float)(a/b)));
        //         break;
        //     default:
        //         System.out.println("Invalid operation");
        // }
        // if (10>a){
        //     System.out.println("10 is less than " + a);
        // }
        statment s = new statment();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        s.ageChecker(age);
    }
}

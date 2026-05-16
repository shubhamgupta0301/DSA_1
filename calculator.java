import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number:");
        int b = sc.nextInt();
        System.out.print("Enter the operator  ( add, sub, multi, div , mod):");
        String operator = sc.next();
        switch(operator){
            case "add":
                System.out.println(a+b);
                break;
            case "sub":
                System.out.println(a-b);
                break;
            case "multi":
                System.out.println(a*b);
                break;
            case "div":
                if(b!=0){
                    System.out.println(a/b);
                }
                else{
                    System.out.println("Cannot divide by zero");
                }
                break;
            case "mod":
                if(b!=0){
                    System.out.println(a%b);
                }
                else{
                    System.out.println("Cannot divide by zero");
                }
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
    
}

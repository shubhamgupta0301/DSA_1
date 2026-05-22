import java.util.*;
public class statment {// This is a class named statment
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
        
        statment s = new statment(); // creating an object of the class statment
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        s.ageChecker(age); //Calling the methods
        sc.close();
    }
}

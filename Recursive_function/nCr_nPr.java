import java.util.*;

public class nCr_nPr {
    // function to find factorial 
    // it uses recursion to find the factorial of a number
    public static int factorial(int num){
        if(num <=1)return 1;
        return num * factorial(num-1);
    }
    // function to find permutation
     public static void nPr(int num , int red){
        int nPr = factorial(num) / factorial(num - red);
        System.out.println(nPr);
        return;
     }
    // function to find combination
     public static void nCr(int num , int red){
        int nCr = factorial(num) / (factorial(red) * factorial(num - red));
        System.out.println(nCr);
        return;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of sample: ");
        int num = sc.nextInt();
        System.out.print("Enter the number of combination: ");
        int reduction = sc.nextInt();
        System.out.print("Enter Choice ( nPr , nCr ): ");
        String choice = sc.next();  //choice btw nPr and nCr
        if(choice.equals("nPr")){
            nPr(num , reduction);
        }
        else if(choice.equals("nCr")){
            nCr(num , reduction);
        }
        else{
            System.out.println("Invalid Choice");
        }
        sc.close();

    }
}

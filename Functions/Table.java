import java.util.*;

public class Table {
    // Function should be inside a class
    static void Table_Of_N(int num){ //This is a function 
        // THis function has no return type So not return statement is needed
        for(int i=1;i<=10 ;i++ ){
            int result= num*i;
            System.out.println( num+ " x "+ i+ " = "+ result);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Table_Of_N(num);// Function call
        sc.close();
    }    
}

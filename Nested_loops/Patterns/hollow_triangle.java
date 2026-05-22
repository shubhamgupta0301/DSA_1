import java.util.*;
public class hollow_triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0 ; i<num ; i++){
            for(int j=0 ; j<=i ; j++){
                if(i==num-1 || j==0 || j==i){ // condition to print star at the last row and first and last column
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}

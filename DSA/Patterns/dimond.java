// This is for diamond without a common line
import java.util.*;
public class dimond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // number of rows
        // upper half of the diamond
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){// for spaces
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){ // for stars
                System.out.print("* ");
            }
            System.out.println();
        } 
        // lower half of the diamond
        for(int i=0;i<num;i++){
            System.out.print(" ");
            for(int j=0;j<i;j++){ // for spaces
                System.out.print(" ");
            }
            for(int k=0;k<num-i;k++){ // for stars
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
 
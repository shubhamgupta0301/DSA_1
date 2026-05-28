import java.util.*;

public class Right_side_piramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // This is a combination of right triangle and reverse right triangle

        //right triangle
        for(int i =0;i<num;i++){
            for(int j =0 ;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //This  2nd loop has one less line then the 1st loop
        //reverse right triangle
        for(int i =1;i<num;i++){
            for(int j =0 ;j<num-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}

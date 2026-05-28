import java.util.*;
public class piramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){ // for spaces
                //create space for pyramid
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){ // for stars
                System.out.print("* ");
            }
            System.out.println();
        } 
        sc.close();
    }
}

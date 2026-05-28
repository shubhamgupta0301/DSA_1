import java.util.*;
public class hollow_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0 ; i<num ; i++){
            for(int j=0; j<num-i ; j++){ // for spaces
                System.out.print("  ");
            }
            for(int k=0; k<2*i-1 ; k++){ // for stars
                if(i == num-1 || k==0 || k==2*i-2){ // logic for printing stars
                    //print start k =0 and k = 2*i-2 (This tells to print star if k is at the end of the row) 
                    // and i =num-1 (This prints the last row of the pyramid)
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

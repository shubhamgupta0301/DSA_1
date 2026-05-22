import java.util.*;
public class hollow_eqi_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num ;i++){
            for(int j=0;j<num-i ;j++){// for spaces
                System.out.print(" ");
            }
            for(int k=0; k<i+1 ; k++){ //for stars
                if(i == num-1 || k==0 || k==i){ // core logic to print all the edge stars only
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

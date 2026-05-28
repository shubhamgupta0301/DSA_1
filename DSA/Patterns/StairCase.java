import java.util.*;
public class StairCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int star =  2; // Initiall no of stars to be printed
        for(int i=1;i<=num;i++){ 
            for(int j=1;j<=star;j++){ // Loop goes till the no. of stars to be printed
                System.out.print("* ");
            }
            if(i%2==0){ // THis increase the no. of stars by 2 after every 2 lines
                star+=2;
            }
            System.out.println();

        }
        sc.close();
    }
}

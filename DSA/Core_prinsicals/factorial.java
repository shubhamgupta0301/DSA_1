import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int result = 1;
        while(num>0){
            result = result * num;
            num--;
        }
        System.out.println(result);
        sc.close();
    }
}

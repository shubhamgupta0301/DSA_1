import java.util.*;
public class binary_add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        Long num1  = Long.parseLong(a,2);
        Long num2  = Long.parseLong(b,2);
        Long sum = num1 + num2;
        String result = Long.toBinaryString(sum);
        System.out.println(result);
        sc.close();   
    }
    
}

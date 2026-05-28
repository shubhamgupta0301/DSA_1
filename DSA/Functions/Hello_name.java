import java.util.*;

public class Hello_name {
    public static String Hello(String s){
        String out = "Hello "+s;
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(Hello(name));
        sc.close();
    }
}

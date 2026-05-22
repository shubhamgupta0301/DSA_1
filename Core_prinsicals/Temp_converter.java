import java.util.*;
public class Temp_converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celcious = sc.nextInt(); 
        int feranite= (celcious * 9 / 5) + 32; // formula to convert degree(c) to degree(f)
        System.out.println(feranite);
        int celcious_converted = (feranite-32)*5/9; // formula to convert degree(f) to degree(c)
        System.out.println(celcious_converted);
        sc.close();
    }
}

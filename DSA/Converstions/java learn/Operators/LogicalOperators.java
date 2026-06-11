

public class LogicalOperators {
    public static void main(String[]args){


        // And && operators
        int p = 15, q = 10, r = 5;
        System.out.println((p > q ) && (p > r)); // true
        System.out.println((p > q) && (p < r)); // false


       // Or || operators
        System.out.println((r < q) || (p < r)); // true
        System.out.println((p > q) || (q > r)); // true
        System.out.println((p < q) || (q < r)); // false
        

        // Not ! operator
        System.out.println(!(p == q)); // true
        System.out.println(!(p > q)); // false
    }
    
}

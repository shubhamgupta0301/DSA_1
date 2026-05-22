import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        int i=2;
        while(i<=Math.sqrt(num)-1){ //Math.sqrt naro downs the max no. of the loop occurance
            if(num%i==0){ // if i / n then i is factor of n i.e it is not prime
                isPrime = false;
                break;
            }
            i++;
        }
        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
        sc.close();
    }
}

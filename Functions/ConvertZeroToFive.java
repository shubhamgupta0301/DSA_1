import java.util.*;

public class ConvertZeroToFive {
    public static int convert(int num){
        int result = 0;
        int place = 1;
        while(num > 0){
            int rem = num%10;
            if(rem == 0){
                rem = 5;
            }
            result = result + rem * place;
            place *= 10;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(convert(num));
        sc.close();

    }
}

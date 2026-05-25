import java.util.*;
public class Experiment {

    public static void evenSum(int num1 , int num2){
        int sum=0;
        for(int i=num1; i<= num2 ;i++){
            if(num1 % 2 == 0){

                sum= sum + num1;
            }
            num1 ++;
        }
        System.out.println(sum);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        evenSum(start,end);
        sc.close();
    }
}

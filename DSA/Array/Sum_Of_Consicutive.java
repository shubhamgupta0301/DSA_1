
import java.util.Scanner;

public class Sum_Of_Consicutive {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int [num];
        int k = sc.nextInt();
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        int result = countOfConsicutive_pair(arr, k);
        System.out.println(result);
        sc.close();
    }

    public static int countOfConsicutive_pair(int []arr,int k){
        int count = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]+arr[i+1] == k){
                count++;
            }
        }
        return count;
    }
}

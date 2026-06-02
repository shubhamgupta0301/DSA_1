
import java.util.*;
public class array_sum_except_itself {
    public static int[] sumArray(int[]arr,int n){
        int sum=0;
        for(int num : arr){
            sum += num;
        }
        for(int i=0; i<n-1;i++){
            arr[i] = sum - arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int[] result = sumArray(arr, size);
        for(int num : result){
            System.out.print(num+" ");
        }
        sc.close();


    }
}



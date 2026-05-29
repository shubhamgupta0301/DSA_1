
import java.util.Scanner;

public class Second_large {
    public static void SecondLargest(int[] arr, int n) {
        // Write code here
        int max = -1;
        int second_largest =-1;
        for(int i=0 ; i<arr.length ;i++){
            if(arr[i]>max)max = arr[i];
        }
        for(int i = 0 ;i < arr.length ;i++ ){
            if(arr[i] >second_largest && second_largest != max){
                second_largest = arr[i];
            }
        }
        System.out.println(second_largest);
        return ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            
        SecondLargest(arr,n);
        sc.close();
        
    }
    
}

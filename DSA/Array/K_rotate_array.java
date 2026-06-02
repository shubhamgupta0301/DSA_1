
import java.util.*;

public class K_rotate_array {
    static void rotateArr(int arr[], int d) {
        // code here
        int len = arr.length ; 
        //int [] result = new int[len];
        d %= len;
        reverse(arr , 0 ,d-1);
        reverse(arr , d,len-1);
        reverse(arr , 0 ,len-1);

    }
        // reverse function
    public static void reverse(int [] arr , int start , int end){
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int []num1  , int i , int j){
        int temp  = num1[i];
        num1[i] = num1 [j];
        num1[j] =temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size  = sc.nextInt();
        int [] arr = new int[size];
        System.out.print("Enter elements of the array : ");
        for(int i=0 ; i<size ; i++)arr[i] = sc.nextInt();
        System.out.print("Enter the Number of rotation : ");
        int k = sc.nextInt();
        rotateArr(arr, k);
        for(int i =0 ; i<size ;i++)System.out.print(arr[i]+ " ");
        sc.close();
    }
    
}

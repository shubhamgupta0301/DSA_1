
import java.util.*;
public class learn {

    public static int[] Create_array(int size){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        input.close();
        return arr;
    }
    public static void Func_To_Print_even(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            if(arr[i] %2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static boolean Find_target(int[] arr, int size , int target){
        for( int i=0; i<size ; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
    public static int Find_target_index(int[] arr, int size , int target){
        for( int i=0; i<size ; i++){
            if(arr[i] == target){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size =sc.nextInt();
        int [] array = Create_array(size);

        //Func_To_Print_even(array);

        System.out.print("Enter the target to search : ");
        int target = sc.nextInt();
        boolean res =Find_target(array, size, target);
        System.out.println(res);
        int index= Find_target_index(array, size, target);
        System.out.println(index);
        sc.close();
    }
}

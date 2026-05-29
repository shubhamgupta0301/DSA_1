import java.util.*;
public class Print_unique_element_array {
    public static int max(int num1,int num2){
        return (num1>num2) ? num1 : num2;
    } 

    public static int printUnique(int[] arr,int n){
        int res= -1;
        for(int i=0;i<arr.length ;i++){
            int element = arr[i];
            for(int j =i+1 ;j<arr.length ;j++){
                if(arr[j] == element){
                    if(res == -1) res = j-i;
                    res  =max(res,j-i);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();

        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int result = printUnique(arr, size);
        if(result == -1){
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
        }else{
            System.out.println(result);
        }
        sc.close();
    }
}

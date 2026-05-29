import java.util.*;

public class Buildings {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    buildings(arr, n);
    }
    public static void buildings(int[] arr, int n) {
    // your code here
    
    int row= arr[0]; // This is the max height of the building
    for(int i=1; i<n; i++){
        if(arr[i]>row){
            row = arr[i];
        }
    }
    for(int i=row; i>0; i--){
        for(int j=0 ; j<n ; j++){
            if( arr[j]>= i ){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
    }
}
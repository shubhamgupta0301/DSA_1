import java.util.*;
public class Shortest_path_btw_even_in_array {
    
    public static int shortestPath(int[] arr,int n){
        int min = -1;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]%2 == 0){
                int ans = -1;
                for(int j =i+1 ; j<arr.length ; j++){
                    if(arr[j]%2 == 0){
                        if(min == -1) min = j-i;
                        min = Math.min(min, j-i);
                        break;
                    }
                    ans++;
                }
            }
        }
        return min;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(shortestPath(arr,size));
        sc.close();


    }
}

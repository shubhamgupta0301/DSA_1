
import java.util.*;
public class Sum_of_arrays {
  static int[] calSum(int a[], int b[], int n, int m) {
    // your code here
    int result[] = new int[Math.max(n,m)+1];

    int i = n-1;
    int j = m-1;
    int k = result.length-1;
    int carry = 0;
    while(i>=0 || j>=0 || carry!=0){
        int sum = carry;
        if(i>=0){
            sum+=a[i];
            i--;
        }
        if(j>=0){
            sum+=b[j];
            j--;
        }
        result[k] = sum%10;
        carry = sum/10;
        k--;
    }
    int rz= result.length;
    if(result[0] == 0){
        int Tresult[] = new int[rz-1];
        for(int x=0; x<rz-1; x++){
            Tresult[x] = result[x+1];
        }
        return Tresult;
    }
      
    return result;
  }

  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    int[] res = calSum(arr1, arr2, n1, n2);
    for (int i : res) System.out.println(i);

  }
}


import java.util.*;
public class Substraction_of_two_array {

    public static int[] subOfArrays(int[] arr1, int[] arr2, int num1, int num2) {

    int[] result = new int[Math.max(num1, num2)];// To take the max index

    int i = num1 - 1;
    int j = num2 - 1;
    int k = result.length - 1;

    int borrow = 0; // Initial borrow

    while (k >= 0) {

        int a = (i >= 0) ? arr1[i] : 0; // Store the value of ele at arr1[i]
        int b = (j >= 0) ? arr2[j] : 0; // Store the value of ele at arr2[j]
        // the element a and b will be the ele to perform the subtraction on.

        a = a - borrow; // Subtract the borrow from a

        if (a < b) { // for this condition we need to borrow
            a = a + 10;
            borrow = 1;
        } else {
            borrow = 0;
        }

        result[k] = a - b; //value to subtraction

        i--;
        j--;
        k--;
    }

    // Remove leading zeros
    int index = 0;

    while (index < result.length - 1 && result[index] == 0) { //For each index starting from 0, till we get a non-zero element we keep incrementing the index.
        index++;
    }

    return Arrays.copyOfRange(result, index, result.length); //The Arrays.copyOfRange() method is used to create a new copy of the original array, with a given start index and the last index till which we need a copy of array.
    //Here we give the start as index (which is the index of 1st non-zero element) and the end as result.length (which is the last index of array) to get the subarray without leading zeros.
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array 1 and 2: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int [] arr1= new int[num1];
        int [] arr2= new int[num2];
        System.out.print("Enter array one: ");
        for(int i=0 ; i<num1 ;i++)arr1[i] = sc.nextInt();
        System.out.print("Enter array two: ");
        for(int i=0 ; i<num2 ;i++)arr2[i] = sc.nextInt();
        int [] result = subOfArrays(arr1, arr2, num1, num2);
        System.out.print("Substraction of two array is: ");
        for(int i=0 ; i<result.length ;i++)System.out.print(result[i]+" ");
        sc.close();
    }
}

//Given an array arr, return the second largest distinct element from an array. 
//If the second largest element doesn't exist then return "there's no second largest element".

import java.util.*;

public class second_largest_elem {
    public static void Sec_largest(int[] arr){
        int large = Integer.MIN_VALUE;
        int S_large = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > large){
                S_large = large;
                large = arr[i];
            }else if(arr[i] > S_large && arr[i] != large){
                S_large = arr[i];
            }
        }
        if(S_large == Integer.MIN_VALUE){
            System.out.println("There's no second largest in the input");
        }else{
            System.out.println("The second largest element is: " + S_large);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = in.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        Sec_largest(arr);
        in.close();
    }
}

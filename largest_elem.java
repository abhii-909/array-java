//Given an array, arr. The task is to find the largest element in it.

import java.util.*;

public class largest_elem {
    public static void largest(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The largest element is: " + max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = in.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        largest(arr);
        in.close();
    }
}

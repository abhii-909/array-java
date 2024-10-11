import java.util.*;

public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
       int arr[] = {1,1,2,2,3,3,4};
        int k = removeDuplicates(arr);
        System.out.print("The array after removing duplicate elements is: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int removeDuplicates(int[] arr) {
        int x = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[x] != arr[i]) {
                x++;
                arr[x] = arr[i];
            }
        }
        return x + 1;
    }
}
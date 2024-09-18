//Problem Statement: Given an array of size n, write a program to check if the given array is sorted in 
//(ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

import java.util.*;

public class sortedArray {
    public static boolean checkSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= arr[i+1]){

            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        boolean x = checkSort(arr);
        System.out.println("Is the array sorted?: " + x);
        in.close();
    }
}
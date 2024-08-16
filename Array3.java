import java.util.Arrays;
// import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int num[] = {2, 4, 5, 6};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change(int[] arr){
        arr[3] = 99;
    }
}
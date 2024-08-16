import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ther size: ");
        int size = in.nextInt();
        int numbers[] = new int[size];

        //input
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = in.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //output
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min){
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Largest number is: " + max);
        System.out.println("Smallest number is: " + min);
        in.close();
    }
}

import java.util.Scanner;

public class Linear_search{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        int numbers[] = new int[size];

        //INPUT
        for (int i = 0; i < size; i++) {
            numbers[i] = in.nextInt();
        }

        System.out.print("Enter x: ");
        int x = in.nextInt();

        //OUTPUT
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == x){
                System.out.println("X found at " + i);
            }
        }
        in.close();
    }
}
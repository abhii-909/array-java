import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = in.nextInt();
        String names[] = new String[size];

        //input
        System.out.println("Enter the names: ");
        for (int i = 0; i < size; i++) {
            names[i] = in.next();
        }

        //output
        for (int i = 0; i < names.length; i++) {
            System.out.println(" Name " + (i+1) + " is: " + names[i]);
        }
        in.close();
    }
}

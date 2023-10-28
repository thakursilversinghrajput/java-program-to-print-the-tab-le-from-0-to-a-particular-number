import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number up to which they want to print the table
        System.out.print("Enter the number for the table: ");
        int n = scanner.nextInt();

        // Print the multiplication table for numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            System.out.println("Multiplication table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Add a line break between tables
        }

        scanner.close();
    }
}


Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class AverageCalculator {

    // Function to calculate average
    public static double findAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 3 numbers
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();

        // Call the function
        double avg = findAverage(n1, n2, n3);

        // Print result
        System.out.println("Average = " + avg);
    }
}


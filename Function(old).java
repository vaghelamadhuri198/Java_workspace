Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class OddSum {

    // Function to calculate sum of odd numbers
    public static int sumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {   // increment by 2 to get only odd numbers
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        int result = sumOfOdd(n);
        System.out.println("Sum of all odd numbers from 1 to " + n + " is: " + result);
    }
}

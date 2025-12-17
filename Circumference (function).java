// Function to return the circumference of a circle
import java.util.Scanner;

public class Main {
    public static double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double circumference = getCircumference(r);

        System.out.println("Circumference of the circle = " + circumference);
    }
}

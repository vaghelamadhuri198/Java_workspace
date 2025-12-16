import java.util.*;
public class condition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age :");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.print("age is an adult:");
		} else {
			System.out.print("age is not an adult:");
		}
	}
}

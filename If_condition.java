import java.util.*;
public class condition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age :");
		int age = sc.nextInt();

		if (age <= 18) {
			System.out.print("age is greater");
		} else {
			System.out.println("age is not greater");
		}
	}
}

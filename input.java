import java.util.*;
public class input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println(name);

		System.out.println("Enter number : ");
		int number = sc.nextInt();
		System.out.println(number);

		System.out.println("Enter number : ");
		float number1 = sc.nextInt();
		System.out.println(number1);

		System.out.println("Enter result : ");
		boolean result = sc.nextBoolean();
		System.out.println(result);
	}
}

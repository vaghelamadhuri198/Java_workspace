import java.util.*;
public class cheak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.print("even");
		} else {
			System.out.print("old");
		}
	}
}

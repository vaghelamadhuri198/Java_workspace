import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int [] number = new int [size];

		System.out.print("Enter size :");
		int size = sc.nextInt();
		int [] number = new int [size];

		//input
		for (int i = 1; i < size; i++) {
			System.out.println(number[i]);
		}

		//output

		for (int i = 1; i < size; i++) {
			number[i] = sc.nextInt();

		}
	}
}

import java.util.*;
public class Main {
	public static void PrintSum(int a, int b) {
        System.out.print("final sum = ");
		int sum = a + b;
		System.out.print(sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a :");

		int a = sc.nextInt();

		System.out.print("Enter b :");

		int b = sc.nextInt();

		PrintSum(a,b);
	}
}

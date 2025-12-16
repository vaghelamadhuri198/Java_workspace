import java.util.*;
public class function {
	public static float Printfactorial(int n) {

		if (n < 0) {
			System.out.print("factorial is not print");
			return 1 ;
		}

		int factorial = 1;

		for (int i = n; i >= 1; i--) {
			factorial = factorial * i ;
			System.out.println(factorial);
		}
             return 1 ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number n :");
		int n = sc.nextInt();

		System.out.println("final factorial");

		Printfactorial(n);

	}
}

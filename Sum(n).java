import java.util.*;
public class Main {
	public static void main(String[] args) {
		//print the sum of first n nutural number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i=0; i <= n; i++) {
			sum = sum + i;
				  System.out.println(sum);
		}
	}
}

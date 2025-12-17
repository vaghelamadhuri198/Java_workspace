import java.util.*;
public class function {
	public static void EvenNumber(int n) {
		int sum = 1;
		for (int i = 1; i<=n; i+=2) {
			sum = sum + i ;
			 if (sum % 2 == 0) {
				System.out.println(i) ;
			 }
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number n :");
		int n = sc.nextInt();

		EvenNumber(n);
	}
}

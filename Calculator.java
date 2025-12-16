//Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
//1 : + (Addition) a + b
//2 : - (Subtraction) a - b
//3 : * (Multiplication) a * b
//4 : / (Division) a / b
//5 : % (Modulo or remainder) a % b
//Calculate the result according to the operation given and display it to the user.
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a");
		int a = sc.nextInt();

		System.out.println("Enter b");
		int b = sc.nextInt();

		System.out.println("choice  operater");

		System.out.println("1: + (Addition)");
		System.out.println("2: - (subtraction)");
		System.out.println("3: * (multiplication)");
		System.out.println("4: / (division)");
		System.out.println("5: % (modulo or reminder)");
		int choice = sc.nextInt();

		int result = 0;

		switch (choice) {
		case 1 :
			result = a + b;
			System.out.println("result :" + result);
			break ;

		case 2 :
			result = a - b;
			System.out.println("result :" + result);
			break ;

		case 3 :
			result = a * b;
			System.out.println("result :" + result);
			break ;

		case 4 :
			result = a / b;
			System.out.println("result :" + result);
			break ;

		case 5 :
			result = a % b;
			System.out.println("result :" + result);
			break ;

			default :
			System.out.println(" No tesult found ");
		}
	}
}

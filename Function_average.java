import java.util.*;
public class function {
	public static void PrintAvg(int a, int b, int c) {

		double  avg = (a + b + c) / 3.0;
		System.out.print("Average" + "=" + avg);
	}


	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a : ");
		int a = sc.nextInt();

		System.out.println("Enter b : ");
		int b = sc.nextInt();

		System.out.println("Enter c : ");
		int c = sc.nextInt();

   PrintAvg(a, b, c);
    	}
}

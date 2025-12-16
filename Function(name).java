import java.util.*;
public class Main {
	public static void PrintmyName(String name) {

		System.out.print(name);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter name :");

		String name = sc.next();

		PrintmyName(name);
	}
}

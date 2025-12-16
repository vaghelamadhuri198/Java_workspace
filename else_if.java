import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter button : ");
		int button = sc.nextInt();

		if (button == 1) {
			System.out.print("good morning");
		} else if (button == 2) {
			System.out.print("good afternoon");
		} else if (button == 3) {
			System.out.print("good night");
		} else {
			System.out.println("nothing");
		}
	}
}

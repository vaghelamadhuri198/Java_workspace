//Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

import java.util.*;
public class main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("radius of a circle as input : ");
		double  radius = sc.nextDouble();

		double calculate = 2 * Math.PI * radius;
		
		double area = Math.PI * radius * radius;
		
		System.out.println(calculate);
		
		System.out.println(area);
	}
}

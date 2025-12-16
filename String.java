import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//declaration
		String name = "madhuri";
		System.out.println(name);

		//input
		String name1 = sc.next();
		System.out.println(name1);

		//corncationation
		String first_Name = "vaghela";
		String last_Name = "madhuri";
		String full_name = first_Name +  last_Name;
		System.out.println(full_name.length());
		
		//charAt
		for(int i=0; i<full_name.length(); i++) {
		System.out.println(full_name.charAt(i));
		}
	}
}

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new  StringBuilder("Tony");
		System.out.println(sb);

		//get index
		System.out.println(sb.charAt(0));

		//set index
		sb.setCharAt((0), 's');
		System.out.println(sb);

		//insert
		sb.insert((0), 's');
		System.out.println(sb);

		//delete
		sb.delete((3), 'n');
		System.out.println(sb);

		//append
		sb.append("madhvi");
		System.out.println(sb);

		//length
		System.out.println(sb.length());
	}
}

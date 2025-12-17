// Function to return the greater of two numbers
public class main {
    public static int greaterNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;

        //int result = greaterNumber(num1, num2);
        //System.out.println("Greater number is: " + result);
       int result = greaterNumber(num1 , num2);
        System.out.print("Greater number is: " + result);
        
    }
}

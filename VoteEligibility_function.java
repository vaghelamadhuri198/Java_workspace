public class VoteEligibility {

    // Function to check voting eligibility
    public static String checkEligibility(int age) {
        if (age > 18) {
            return "Eligible to vote";
        } else {
            return "Not eligible to vote";
        }
    }

    public static void main(String[] args) {
        int age = 20; // You can change the age to test
        System.out.println(checkEligibility(age));
    }
}

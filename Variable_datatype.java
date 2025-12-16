// Java program to declare meaningful variables of each data type
public class MeaningfulVariables {
    public static void main(String[] args) {
        
        // Integer types
        byte age = 25;                 // small whole number
        short year = 2025;             // short range whole number
        int population = 1400000000;   // large whole number
        long phoneNumber = 9876543210L; // very large number, use 'L' at the end

        // Floating-point types
        float temperature = 36.6f;     // decimal number, use 'f' at the end
        double price = 9999.99;        // more precise decimal number

        // Character type
        char grade = 'A';              // single character

        // Boolean type
        boolean isJavaFun = true;      // true or false value

        // String type (not primitive)
        String name = "Madhuri Vaghela"; // text value

        // Print all variables
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Population: " + population);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Temperature: " + temperature);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun: " + isJavaFun);
        System.out.println("Name: " + name);
    }
}

// Import Scanner class for user input
import java.util.Scanner;  

// Define the main class
public class HelloJava {
    // Main method - The entry point of the Java program
    public static void main(String[] args) {
        // Print a welcome message
        System.out.println("🚀 Welcome to Java Programming!");

        // Creating a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask for user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Reads user input (String)

        // Ask for two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();  // Reads an integer input

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();  // Reads another integer input

        // Perform a simple math operation (addition)
        int sum = num1 + num2;

        // Print the results
        System.out.println("Hello, " + name + "! 👋");
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}


/*output:
🚀 Welcome to Java Programming!
Enter your name: User's
Enter first number: 10
Enter second number: 5
Hello, User's! 👋
The sum of 10 and 5 is: 15
*/

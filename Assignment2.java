import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String doAnother = ""; // Initialize the variable

        do {
            // Prompt the user for a positive whole number
            System.out.print("Enter a whole number > 0: ");
            int n = scanner.nextInt();

            // Validate input
            if (n <= 0) {
                System.out.println("Please enter a positive whole number!");
                continue;
            }

            // Variables to track the sequence
            int highest = n;
            int terms = 0;
            StringBuilder sequence = new StringBuilder();

            // Generate the Collatz sequence
            while (n != 1) {
                sequence.append(n).append("; ");
                terms++;
                if (n % 2 == 0) {
                    n /= 2; // If n is even, divide by 2
                } else {
                    n = 3 * n + 1; // If n is odd, multiply by 3 and add 1
                }
                // Update the highest value
                if (n > highest) {
                    highest = n;
                }
            }

            // Append the final 1 in the sequence
            sequence.append("1");
            terms++; // Include the final term (1)

            // Output the results
            System.out.println("The Collatz sequence for n = " + n + " is: " + sequence);
            System.out.printf("Number of terms = %,d%n", terms);
            System.out.printf("Highest value reached = %,d%n", highest);

            // Ask the user if they want to do another sequence
            System.out.print("Do another? (y/n): ");
            doAnother = scanner.next();

        } while (doAnother.equalsIgnoreCase("y"));

        System.out.println("Goodbye!");
        scanner.close();
    }
}

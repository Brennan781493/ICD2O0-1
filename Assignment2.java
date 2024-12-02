import java.util.Scanner; // Import the Scanner class to read user input

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        String doAnother = ""; // Initialize a variable to control whether the user wants to repeat the process

        do {
            // Prompt the user to enter a positive whole number
            System.out.print("Enter a whole number > 0: ");
            int n = scanner.nextInt(); // Read the user's input and store it in variable 'n'

            // Validate the input to ensure it's a positive whole number
            if (n <= 0) {
                System.out.println("Please enter a positive whole number!"); // Display an error message for invalid input
                continue; // Skip the rest of the loop iteration and start over
            }

            // Variables to track the sequence, highest number, and term count
            int highest = n; // Initialize the highest number reached with the starting value
            int terms = 0; // Initialize the term counter
            StringBuilder sequence = new StringBuilder(); // Use a StringBuilder to construct the sequence

            // Generate the Collatz sequence until n reaches 1
            while (n != 1) {
                sequence.append(n).append("; "); // Append the current value of 'n' to the sequence
                terms++; // Increment the term counter

                if (n % 2 == 0) { // Check if 'n' is even
                    n /= 2; // If even, divide 'n' by 2
                } else { // Otherwise, 'n' is odd
                    n = 3 * n + 1; // Apply the Collatz operation for odd numbers
                }

                // Update the highest value reached, if the current 'n' is greater
                if (n > highest) {
                    highest = n;
                }
            }

            // Append the final '1' to the sequence, as it is always the last number
            sequence.append("1");
            terms++; // Increment the term counter to include the final '1'

            // Output the results
            System.out.println("The Collatz sequence for n = " + sequence.toString().split(";")[0].trim() + " is: " + sequence);
            System.out.printf("Number of terms = %,d%n", terms); // Print the total number of terms
            System.out.printf("Highest value reached = %,d%n", highest); // Print the highest number reached

            // Ask the user if they want to run the program again
            System.out.print("Do another? (y/n): ");
            doAnother = scanner.next(); // Read the user's response

        } while (doAnother.equalsIgnoreCase("y")); // Repeat the loop if the user enters "y" (case-insensitive)

        System.out.println("Goodbye!"); // Print a farewell message when the user chooses not to continue
        scanner.close(); // Close the Scanner object to release system resources
    }
}

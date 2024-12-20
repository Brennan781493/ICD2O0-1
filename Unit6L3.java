import java.util.Scanner;

public class Unit6L3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a percentage mark
        System.out.print("Please enter a percentage mark: ");
        int mark = scanner.nextInt();

        // Determine the letter grade based on the mark
        String grade;
        if (mark >= 80 && mark <= 100) {
            grade = "A";
        } else if (mark >= 70 && mark <= 79) {
            grade = "B";
        } else if (mark >= 60 && mark <= 69) {
            grade = "C";
        } else if (mark >= 50 && mark <= 59) {
            grade = "D";
        } else if (mark >= 0 && mark <= 49) {
            grade = "F";
        } else {
            System.out.println("Invalid input. Please enter a mark between 0 and 100.");
            scanner.close();
            return; // Exit the program if the input is out of range
        }

        // Display the letter grade
        System.out.println(mark + " is a letter grade of " + grade + ".");
        System.out.println("Resart!");

        scanner.close();
    }
}


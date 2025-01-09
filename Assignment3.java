import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize counters for wins, losses, and ties
        int playerWins = 0, computerWins = 0, ties = 0;

        // Prompt the user for the number of games
        System.out.print("How many games would you like to play? ");
        int totalGames = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < totalGames; i++) {
            // Get the player's choice
            System.out.print("Enter your choice (r for rock, p for paper, s for scissors): ");
            char playerChoice = scanner.nextLine().toLowerCase().charAt(0);

            // Generate the computer's choice
            int randomChoice = (int) (3 * Math.random());
            char computerChoice = ' ';
            if (randomChoice == 0) {
                computerChoice = 'r'; // Rock
            } else if (randomChoice == 1) {
                computerChoice = 'p'; // Paper
            } else if (randomChoice == 2) {
                computerChoice = 's'; // Scissors
            }

            // Display the computer's choice
            System.out.println("Computer chose: " + computerChoice);

            // Compare choices to determine the outcome
            if (playerChoice == computerChoice) {
                System.out.println("It's a tie!");
                ties++;
            } else if ((playerChoice == 'r' && computerChoice == 's') ||
                       (playerChoice == 'p' && computerChoice == 'r') ||
                       (playerChoice == 's' && computerChoice == 'p')) {
                System.out.println("You win this round!");
                playerWins++;
            } else {
                System.out.println("Computer wins this round!");
                computerWins++;
            }
        }

        // Print the final results
        System.out.println("\nGame Over!");
        System.out.println("Player wins: " + playerWins);
        System.out.println("Computer wins: " + computerWins);
        System.out.println("Ties: " + ties);

        scanner.close();
    }
}

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the player how many games they want to play
        System.out.print("How many games would you like to play? ");
        int totalGames = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        int playerWins = 0, computerWins = 0, ties = 0;

        for (int i = 0; i < totalGames; i++) {
            // Prompt the user to enter r, p, or s
            System.out.print("Enter your choice (r for rock, p for paper, s for scissors): ");
            char playerChoice = scanner.nextLine().toLowerCase().charAt(0);
            
            // Generate the computer's choice
            int computerRandom = (int) (3 * Math.random());
            char computerChoice;
            if (computerRandom == 0) {
                computerChoice = 'r';
            } else if (computerRandom == 1) {
                computerChoice = 'p';
            } else {
                computerChoice = 's';
            }

            // Display computer's choice
            System.out.println("Computer chose: " + computerChoice);

            // Determine the winner
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

        // Output the final results
        System.out.println("\nGame Over!");
        System.out.println("Total games played: " + totalGames);
        System.out.println("Player wins: " + playerWins);
        System.out.println("Computer wins: " + computerWins);
        System.out.println("Ties: " + ties);

        scanner.close();
    }
}


import java.util.Scanner; // Import the Scanner class for user input

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the number of games they want to play
        System.out.print("How many games would you like to play? ");
        int totalGames = scanner.nextInt(); // Read the number of games
        scanner.nextLine(); // Consume the newline character left by nextInt()
        
        // Initialize counters for wins, losses, and ties
        int playerWins = 0; 
        int computerWins = 0; 
        int ties = 0;

        // Loop for the number of games the player wants to play
        for (int i = 0; i < totalGames; i++) {
            // Prompt the user to input their choice (r, p, or s)
            System.out.print("Enter your choice (r for rock, p for paper, s for scissors): ");
            char playerChoice = scanner.nextLine().toLowerCase().charAt(0); // Read and convert to lowercase
            
            // Generate the computer's random choice (0, 1, or 2)
            int computerRandom = (int) (3 * Math.random()); // Randomly generates 0, 1, or 2
            char computerChoice; // Variable to store the computer's choice
            
            // Map random numbers to 'r', 'p', or 's' for the computer
            if (computerRandom == 0) {
                computerChoice = 'r'; // 0 corresponds to rock
            } else if (computerRandom == 1) {
                computerChoice = 'p'; // 1 corresponds to paper
            } else {
                computerChoice = 's'; // 2 corresponds to scissors
            }

            // Display the computer's choice
            System.out.println("Computer chose: " + computerChoice);

            // Compare the player's choice with the computer's choice to determine the outcome
            if (playerChoice == computerChoice) {
                System.out.println("It's a tie!"); // If choices are the same, it's a tie
                ties++; // Increment the tie counter
            } else if ((playerChoice == 'r' && computerChoice == 's') || 
                       (playerChoice == 'p' && computerChoice == 'r') || 
                       (playerChoice == 's' && computerChoice == 'p')) {
                System.out.println("You win this round!"); // Player wins based on rules
                playerWins++; // Increment the player win counter
            } else {
                System.out.println("Computer wins this round!"); // Computer wins otherwise
                computerWins++; // Increment the computer win counter
            }
        }

        // Display the final results after all games are played
        System.out.println("\nGame Over!");
        System.out.println("Total games played: " + totalGames); // Total games played
        System.out.println("Player wins: " + playerWins); // Total games player won
        System.out.println("Computer wins: " + computerWins); // Total games computer won
        System.out.println("Ties: " + ties); // Total games that ended in a tie

        // Close the scanner to release resources
        scanner.close();
    }
}

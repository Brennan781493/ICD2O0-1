import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three words
        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();
       
        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();
       
        System.out.print("Enter the third word: ");
        String word3 = scanner.nextLine();

        String first, next, last;

        // Determine the order using compareTo()
        if (word1.compareTo(word2) < 0 && word1.compareTo(word3) < 0) {
            first = word1;
            if (word2.compareTo(word3) < 0) {
                next = word2;
                last = word3;
            } else {
                next = word3;
                last = word2;
            }
        } else if (word2.compareTo(word1) < 0 && word2.compareTo(word3) < 0) {
            first = word2;
            if (word1.compareTo(word3) < 0) {
                next = word1;
                last = word3;
            } else {
                next = word3;
                last = word1;
            }
        } else {
            first = word3;
            if (word1.compareTo(word2) < 0) {
                next = word1;
                last = word2;
            } else {
                next = word2;
                last = word1;
            }
        }

        // Display the words in alphabetical order
        System.out.println("The first word is: " + first);
        System.out.println("The next word is: " + next);
        System.out.println("The last word is: " + last);

        scanner.close();
    }
}

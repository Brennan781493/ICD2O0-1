import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    String greeting = new String();
    String greetings = new String();

    System.out.print("Hi. Please enter a greeting in one word: ");
    greeting = kbd.next();
    kbd.nextLine();
    System.out.printf("You said: %s.\n", greeting);
    System.out.print("Hi. Please enter a greeting in more than one word: ");
    greetings = kbd.next();
    System.out.printf("\nYou said: ", greetings);
  }
}

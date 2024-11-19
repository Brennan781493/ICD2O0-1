import java.util.Scanner;

class Unit5L6 {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    String greeting = new String();
    String greetings = new String();

    System.out.print("Hi. Please enter a greeting in one word: ");
    greeting = kbd.next();
    kbd.nextLine();
    System.out.printf("You said: %s.\n", greeting);
    System.out.print("Hi. Please enter a greeting in more than one word: ");
    greetings = kbd.nextLine();
    System.out.printf("You said: %s.\n", greetings);
  }
}

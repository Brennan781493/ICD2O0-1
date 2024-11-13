import java.util.Scanner;

class Main {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Please enter the probability of precipitation (0 to 1): ");
   double number = sc.nextDouble();

   if (number < 0.07) {
     System.out.println("The forecast is dry weather.");
   } else if (number > 0.6) {
     System.out.println("The forecast is a small chance of rain.");
   
   } else {
     System.out.println("The forecast is rain.");
   }
 }
}

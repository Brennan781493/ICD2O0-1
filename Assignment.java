package assignment.brennan;
import java.lang.Math;//introduces the math library to java
import java.util.Scanner;//introduces scanner

/*
Brennan Ho 781493
Date: 30, September, 2024
Course: Grade 10 Comp Sci
Title: area/volume calculator
Description: a program that calculates the area and volume of different shapes.
*/
public class AssignmentBrennan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
  // TODO code application logic here
        
        Scanner sc = new Scanner(System.in); //
        double length;// tells java what these variables are and double lets the responses be in decimals
        double width;
        double area;
        System.out.print("I will now calculate the area or your rectangle");// tells user what the program will do
        System.out.printf("\ninsert length of rectangle: "); // tells user to input the length of their rectangle
        length=sc.nextDouble();// tells java that the next thing that has been inserted is the length
        System.out.printf("insert width of rectangle: ");// tells user to input width of rectangle
        width=sc.nextDouble();// tells java that whatever the user stated is the width
        area=length*width;//tells java that area is the length times width
        System.out.printf("area is %.2f", area);// tells java to print the area to 2 decimal places
       
        // area of a circle
        double radius = 0;// introduces new variables and states that the radius is equal to 0
        double area2;
        System.out.print("\nI will now calculate the area or your circle");// tells the user that we are now calculating the area of a circle
        System.out.printf("\n input radius: ");// tells user to type the radius of their circle in
        radius = sc.nextDouble();// tells java that the next thing typed by the user is the radius
        area = (Math.PI *radius*radius);// tells java to take Pi and multiply it by radius squared
        System.out.printf("area is: %.2f", area);// tells java to print the area to 2 decimal points
       

        double radius2;// introduces new variables
        double area3;
        double height;
        double volume;
        System.out.print("\nI will now calculate the volume and surface area of your cylinder");// tells the user we will be calculating the volume and surface area of a cylinder
        System.out.printf("\n input radius: ");// tells user to input the radius of their cylinder
        radius2 = sc.nextDouble();// tells java that the next input is the radius of the cylinder
        area3 = (Math.PI *radius*radius);// finds the are of the circle of the cylinder
        System.out.printf("input height: " );// tells the user to tell java the height of the cylinder
        height = sc.nextDouble();// tells java that the user has just inputted the height of the cylinder
        volume = (area3*height);// tells java how to find the volume with the info previously given
        System.out.printf("volume is: %.2f ", volume);// prints the volume of the cylinder
      

        double P;// introduces more variables
        double g = 9.8;// says that g is equal to 9.8 because gravity is = 9.8m/s
        double L;
        System.out.print("\nI will now calculate the time it takes for your pendulum to make one back and forth swing");// tells the user what we will calculate next
        System.out.printf("\n  insert pendulum length in meters: ");// java asks for the user to input the length of the pendulum in meters
        L = sc.nextDouble();// lets java know that the next input is L(length)
        P = (Math.PI*Math.sqrt(L/g)*2.);// tells java that P(period) = Pi times the square root of L/g times 2
        System.out.printf("period of one pendulum swing: %.2f ", P);// tells the user what one period is in seconds to 2 decimal points
    }
}

package assignment.brennan;
import java.lang.Math;//introduces the math library to java
import java.util.Scanner;//introduces scanner library

/*
Brennan Ho 781493
Date: 30, September, 2024
Course: Grade 10 Comp Sci
Title: area/volume calculator
Description: a program that calculates the area and volume of different shapes.
*/

/* VARIABLE DICTIONARY
length=length of rectangle
width=width of rectangle
area=area of ractangle
radius=radius of circle
area2=area of circle
radius2=radius of cylinder
area3=area of circle from cylinder
height=height of cylinder
volume=volume of cylinder
circumfrence=circumfrence of cylinder
surfacearea=surface area of cylinder
P=period of pendulum
g=gravity
L=length of pendulum in meters
*/

public class AssignmentBrennan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
  // TODO code application logic here
        
        Scanner sc = new Scanner(System.in); //introduces scanner
        //tells java what these variables are and double lets the responses be in decimal
        double length;
        double width;
        double area;
        // tells user what the program will do
        System.out.print("I will now calculate the area or your rectangle");
         // tells user to input the length of their rectangle
        System.out.printf("\ninsert length of rectangle: ");
         // tells java that the next thing that has been inserted is the length
        length=sc.nextDouble();
       // tells user to input width of rectangle
        System.out.printf("insert width of rectangle: ");
        width=sc.nextDouble();// tells java that whatever the user stated is the width
        area=length*width;//tells java that area is the length times width
        // tells java to print the area to 2 decimal places
        System.out.printf("area is %.2f", area);
       
        // area of a circle
        // introduces new variables and states that the radius is equal to 0
        double radius = 0;
        double area2;
        // tells the user that we are now calculating the area of a circle
        System.out.print("\nI will now calculate the area or your circle");
        // tells user to type the radius of their circle in
        System.out.printf("\ninput radius: ");
        // tells java that the next thing typed by the user is the radius
        radius = sc.nextDouble();
        // tells java to take Pi and multiply it by radius squared
        area = (Math.PI *radius*radius);
        // tells java to print the area to 2 decimal points
        System.out.printf("area is: %.2f", area);
       
        double radius2;// introduces new variables
        double area3;
        double height;
        double volume;
        double circumference;// introduces new variables
        double surfacearea;
        //tells the user we will be calculating the volume and surface area of a cylinder
        System.out.print("\nI will now calculate the volume and surface area of your cylinder");
        // tells user to input the radius of their cylinder
        System.out.printf("\ninput radius: ");
        // tells java that the next input is the radius of the cylinder
        radius2 = sc.nextDouble();
        area3 = (Math.PI *radius*radius);// finds the are of the circle of the cylinder
        // tells the user to tell java the height of the cylinder
        System.out.printf("input height: " );
        // tells java that the user has just inputted the height of the cylinder
        height = sc.nextDouble();
        // tells java how to find the volume with the info previously given
        volume = (area3*height);
        System.out.printf("volume is: %.2f ", volume);//prints the volume of the cylinder
        // finds the circumference with the radius given earlier
        circumference = 2*Math.PI*radius2;
        // finds surface area
        surfacearea = area3*2+circumference*height;
        // displays the surface area to user
        System.out.printf("\nSurface area is: %.2f ", surfacearea);   
        
        double P;// introduces more variables
        double g = 9.8;// says that g is equal to 9.8 because gravity is = 9.8m/s
        double L;// tells the user what we will calculate next
        System.out.print("\nI will now calculate the time it takes for your pendulum to make one back and forth swing");
        // java asks for the user to input the length of the pendulum in meters
        System.out.printf("\ninsert pendulum length in meters: ");
        L = sc.nextDouble();// lets java know that the next input is L(length)
        // tells java that P(period) = Pi times the square root of L/g times 2
        P = (Math.PI*Math.sqrt(L/g)*2.);
        // tells the user what one period is in seconds to 2 decimal points
        System.out.printf("period of one pendulum swing: %.2f ", P);
    }
}

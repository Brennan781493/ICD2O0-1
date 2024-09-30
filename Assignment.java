package assignment.brennan;
import java.lang.Math;
import java.util.Scanner;

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
        
        Scanner sc = new Scanner(System.in);
        double length;
        double width;
        double area;
        System.out.print("I will now calculate the area or your rectangle");
        System.out.printf("\ninsert length of rectangle: "); 
        length=sc.nextInt();
        System.out.printf("insert width of rectangle: ");
        width=sc.nextInt();
        area=length*width;
        System.out.printf("area is %.2f", area);
       
        // area of a circle
        double radius = 0;
        double area2;
        System.out.print("\nI will now calculate the area or your circle");
        System.out.printf("\n input radius: ");
        radius = sc.nextDouble();
        area = (Math.PI *radius*radius);
        System.out.printf("area is: %.2f", area);
       

        double radius2;
        double area3;
        double height;
        double volume;
        System.out.print("\nI will now calculate the volume of your cylinder");
        System.out.printf("\n input radius: ");
        radius2 = sc.nextDouble();
        area3 = (Math.PI *radius*radius);
        System.out.printf("input height: " );
        height = sc.nextDouble(); 
        volume = (area3*height);    
        System.out.printf("volume is: %.2f ", volume);
      

        double P;
        double g = 9.8;
        double L;
        System.out.print("\nI will now calculate the time it takes for your pendulum to make one back and forth swing");
        System.out.printf("\n  insert pendulum length in meters: ");
        L = sc.nextDouble();
        P = (Math.PI*Math.sqrt(L/g)*2.);
        System.out.printf("period of one pendulum swing: %.2f ", P);
        
    }
}

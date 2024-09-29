package assignment.brennan;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author 781493
 */
public class AssignmentBrennan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
  // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int length;
        int width;
        int area;
        System.out.printf("insert length of rectangle: "); 
        length=sc.nextInt();
        System.out.printf("insert width of rectangle: ");
        width=sc.nextInt();
        area=length*width;
        System.out.printf("area is %d\n", area);
        
        // area of a circle
        double radius = 0;
        double area2;
        System.out.printf("input radius: ");
        radius = sc.nextDouble();
        area = (int) (Math.PI *radius*radius);
        System.out.printf("area is: " + area);
        area2 = sc.nextDouble();

        double radius2;
        double area3;
        double height;
        double volume;
        System.out.printf("input radius: ");
        radius2 = sc.nextDouble()
        area = (int) (Math.PI *radius*radius);
        system.out.printf("area is: ");
        area3 = sc.nextDouble();
        System.out.printf("input height")
        height = sc.nextDouble(); 
        volume = (area3*height);    
        System.out.printf("volume is: " + volume);
        volume = sc.nextDouble();

        int P = ofSeconds(seconds);
        int g = 9.8;
        int L = ofMeters(meters);
        System.out.printf("length in meters: ");
        L = sc.nextInt();
        P = (int) (Math.PI*2*sqrt(L/g));
        System.out.printf("period of one pendulum swing: ")
        P = sc.next int();
    }

}

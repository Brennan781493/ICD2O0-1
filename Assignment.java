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
        System.out.print("input radius: ");
        radius = sc.nextDouble();
        area = (int) (Math.PI *radius*radius);
        System.out.print("area is: " + area);
        area2 = sc.nextDouble();

        double radius2;
        double area3;
        double height;
        double volume;
        System.out.print("input radius: ");
        radius2 = sc.nextDouble();
        area3 = (int) (Math.PI *radius*radius);
        System.out.print("input height");
        height = sc.nextDouble(); 
        volume = (area3*height);    
        System.out.print("volume is: " + volume);
        volume = sc.nextDouble();

        int P;
        int g ;
        int L;
        System.out.print("length in meters: ");
        L = sc.nextInt();
        P = (Math.PI*2*method.sqrt(L/g));
        System.out.print("period of one pendulum swing: " + P);
        P = sc.nextInt();
    }
}

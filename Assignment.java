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
        System.out.printf("Area is: " + area);
        area2 = sc.nextDouble();
    }

}

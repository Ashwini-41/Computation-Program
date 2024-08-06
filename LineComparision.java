import java.util.*;
public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Points X1 and Y1 : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter Points X2 and Y2 : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double length = Math.sqrt((x2-x1)^2 + (y2 - y1 )^2);

        System.out.println("Distance between two points is : " + length);
        

    }
}

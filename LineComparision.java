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

        double length1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2 - y1),2));

       System.out.printf("Length of line is %.2f%n" ,length1);

       System.out.print("Enter Points X3 and Y3 : ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        System.out.print("Enter Points X4 and Y4 : ");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        double length2 = Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4 - y3),2));
        System.out.printf("Length of line is %.2f%n" ,length2);

        String line1Length = String.valueOf(length1);
        String line2Length = String.valueOf(length2);


        if(line1Length.equals(line2Length)){
           System.out.println("Two lines are equal. ");
        }else{
            System.out.println("Two lines are not equal. ");

        }
     

    }
}

package chapterTwo;
import java.util.Scanner;
public class Diameter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int circleRadius;
        System.out.println("Enter radius");
        circleRadius = input.nextInt();
        double circumference= 2 * Math.PI * circleRadius;
        int diameter= 2 * circleRadius;
        double area = Math.PI * (circleRadius * circleRadius) ;
        System.out.println("circumference is " + circumference);
        System.out.println("diameter is " + diameter);
        System.out.println("area is " + area);



    }
}

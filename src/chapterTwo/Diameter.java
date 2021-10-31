package chapterTwo;
import java.util.Scanner;
public class Diameter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius;
        System.out.println("Enter radius");
        radius = input.nextInt();
        double circumference= 2 * Math.PI* radius;
        int diameter= 2 * radius;
        double area = Math.PI * (radius * radius) ;
        System.out.println("circumference is " +circumference);
        System.out.println("diameter is " +diameter);
        System.out.println("area is " +area);



    }
}

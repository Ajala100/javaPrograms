package chapterTwo;

import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = input.nextInt();
        System.out.printf("%s%d%n", "Diameter of the circle is: ", 2 * radius);
        System.out.printf("%s%.2f%n", "Circumference of the circle is: ", 2 * Math.PI * radius);
        System.out.printf("%s%.2f%n", "Area of the circle is: ", Math.PI * Math.pow(radius,2));
    }
}

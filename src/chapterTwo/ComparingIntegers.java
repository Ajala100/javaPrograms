package chapterTwo;
import java.util.Scanner;
public class ComparingIntegers {
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        number1 = input.nextInt();
        System.out.println("Enter second integer");
        number2 = input.nextInt();
        if(number1 > number2)
            System.out.println(number1+ " is larger");
        if (number1 == number2)
            System.out.println("These numbers are equal");


    }
}

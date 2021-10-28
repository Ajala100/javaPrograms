package chapterTwo;
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {

        int sum;
        int product;
        int difference;
        int quotient;
        int number1;
        int number2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        number1 = input.nextInt();
        System.out.println("Enter Second integer");
        number2 = input.nextInt();
        sum = number1 + number2;
        System.out.println("sum is " +sum);
        difference = number1 - number2;
        System.out.println("difference is " +difference);
        product = number1 * number2;
        System.out.println("product is "+ product);
        quotient = number1 / number2;
        System.out.println("quotient is " +quotient);


    }
}

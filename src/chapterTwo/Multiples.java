package chapterTwo;
import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("Enter first number");
        number1 = input.nextInt();
        System.out.println("Enter second Number");
        number2 = input.nextInt();
        if(number2 % number1 ==0)
            System.out.println("first number is a multiple of the second number");
        if(number2 % number1 != 0)
            System.out.println("first number is not a multiple of the second number");

    }

}

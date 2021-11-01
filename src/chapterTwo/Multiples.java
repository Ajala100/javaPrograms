package chapterTwo;
import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        System.out.println("Enter first number");
        firstNumber = input.nextInt();
        System.out.println("Enter second Number");
        secondNumber = input.nextInt();
        if(secondNumber % firstNumber ==0)
            System.out.println("first number is a multiple of the second number");
        if(secondNumber % firstNumber != 0)
            System.out.println("first number is not a multiple of the second number");

    }

}

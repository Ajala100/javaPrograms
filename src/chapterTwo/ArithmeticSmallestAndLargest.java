package chapterTwo;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        int sum;
        int average;
        int product;
        int largestNumber = 0;
        int smallestNumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        number1 = input.nextInt();
        System.out.println("Enter second integer:");
        number2 = input.nextInt();
        System.out.println("Enter third integer:");
        number3= input.nextInt();
        sum = number1 + number2 + number3;
        System.out.println("sum is " +sum);
        average = (number1 + number2 + number3) /3 ;
        System.out.println("average is " +average );
        product = number1 * number2 * number3;
        System.out.println("product is " +product);
        largestNumber = largestNumber + number1;
        if(number2 > largestNumber)
            largestNumber = number2;
        if(number3> number2 && number3 > number1)
            largestNumber = number3;
        System.out.println("largest number is " +largestNumber);
        smallestNumber = smallestNumber + number1;
        if(number2 < number1)
            smallestNumber = number2;
        if(number3 < number2 && number3 < number1)
            smallestNumber = number3;
        System.out.println("smallest number is "+smallestNumber);



    }
}

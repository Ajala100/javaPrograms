package chapterTwo;
import java.util.Scanner;
public class PrintLargestAndSmallestNumber {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int largestNumber = 0;
        int smallestNumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1:");
        number1 = input.nextInt();
        System.out.println("Enter number 2:");
        number2 = input.nextInt();
        System.out.println("Enter number 3:");
        number3 = input.nextInt();
        System.out.println("Enter number 4:");
        number4 = input.nextInt();
        System.out.println("Enter number 5: ");
        number5 = input.nextInt();
        largestNumber = largestNumber + number1;
        if(number2 > number1)
            largestNumber = number2;
        if(number3 > number2 && number3 > number1)
            largestNumber = number3;
        if(number4 > number3 && number4 > number2 && number4 > number1)
            largestNumber = number4;
        if(number5 > number4 && number5 > number3 && number5 >number2 && number5 > number1)
            largestNumber = number5;
       smallestNumber = smallestNumber + number1;
       if(number2 < number1)
           smallestNumber = number2;
       if(number3 < number2 && number3 < number1)
           smallestNumber = number3;
       if(number4 < number3 && number4 < number2 && number4 < number1)
           smallestNumber = number4;
       if(number5 < number4 && number5 < number3 && number5 < number2 && number5 <1)
           smallestNumber = number5;
       System.out.println("Largest Number is " +largestNumber);
       System.out.println("Smallest Number is " +smallestNumber);



    }

}

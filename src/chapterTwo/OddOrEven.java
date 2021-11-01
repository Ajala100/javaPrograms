package chapterTwo;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        number = input.nextInt();
        if(number % 2 ==0)
            System.out.println("number is an even number");
        if (number % 2 != 0)
            System.out.println("number is an odd number");

    }
}

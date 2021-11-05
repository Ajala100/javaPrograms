package chapterTwo;

import java.util.Scanner;

public class SeparatingTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five digit number: ");
        int fiveDigitNumber = input.nextInt();
        int fifthDigit = fiveDigitNumber % 10;
        int fourDigitNumber = fiveDigitNumber / 10;
        int fourthDigit = fourDigitNumber % 10;
        int threeDigitNumber = fourDigitNumber / 10;
        int thirdDigit = threeDigitNumber % 10;
        int twoDigitNumber = threeDigitNumber / 10;
        int secondDigit = twoDigitNumber % 10;
        int firstDigit = twoDigitNumber / 10;
        System.out.println("Individual digits present in the five digit number supplied are: ");
        System.out.printf("%d%s%d%s%d%s%d%s%d", fifthDigit, "   ", fourthDigit, "   ", thirdDigit, "   ", secondDigit, "   ", firstDigit, "   ");

    }
}

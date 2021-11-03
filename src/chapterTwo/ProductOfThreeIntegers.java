package chapterTwo;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ProductOfThreeIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int z;
        int result;
        System.out.println("Enter First Integer");
        x = input.nextInt();
        System.out.println("Enter Second Integer");
        y = input.nextInt();
        System.out.println("Enter Third Integer");
        z = input.nextInt();
        result = x * y * z;
        System.out.printf("%s%d", "product is ", result);
    }
}

package chapterTwo;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        int value;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        value = input.nextInt();
        if(value % 2 ==0)
            System.out.println("number is an even number");
        if (value % 2 != 0)
            System.out.println("number is an odd number");
    }
}

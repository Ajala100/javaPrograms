package chapterTwo;

import jdk.swing.interop.SwingInterOpUtils;

public class Sample {
    public static void main(String[] args) {
        int x =2;
        int y = 3;
        int a ;
        System.out.printf("x = %d%n", x);
        System.out.printf("value of %d + %d = %d%n", x, x, (x+x));
        System.out.printf("x=");
        System.out.printf("%d=%d%n", (x+y), (y+x));
        System.out.println( a = (y * (x*x))+ 7);
        System.out.println( a = 7 + 3 * 6 / 2 - 1);
        System.out.println(a = (3 * 9 * (3 + (9 * 3 / (3)))));
        System.out.println("1 2 3 4");
        System.out.println(a = y * (x * x * x) + 7);
        System.out.printf("%d %d %d %d%n", 1, 2, 3,  4);
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4 ");
    }
}

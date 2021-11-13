package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort1 {
    public static void main(String[] args) {
        String [] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        List<String> list = Arrays.asList(suits);
        System.out.printf("%s%s%n", "Unsorted Array elements are: ", list);
        Collections.sort(list);
        System.out.printf("Sorted Array Elements in Ascending Order is: %s%n", list);
        String [] suit2 = {"Hearts", "Diamonds", "Clubs", "Spades"};
        List <String> list2 = Arrays.asList(suit2);
        Collections.sort(list2, Collections.reverseOrder());
        System.out.printf("Sorted Array Elements in Descending Order is: %s%n", list2);
    }
}

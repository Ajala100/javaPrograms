package ChapterSixteen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPractice {
    public static void printSortedSet(SortedSet<String> set){
        for(String value: set) System.out.printf("%s ", value.toUpperCase());
        System.out.println();

    }
    public static void main(String[] args) {
        String [] colors = {"Blue", "Red", "Pink", "White", "Blue", "Wine", "Pink", "Blue"};
        SortedSet <String> tree = new TreeSet<>(Arrays.asList(colors));
        System.out.println("Elements in Sorted set 'tree' are: ");
        printSortedSet(tree);
        System.out.println("Subset of TreeSet tree for elements before 'White'");
        printSortedSet(tree.headSet("White"));
        System.out.println("Subset of TreeSet tree for elements from 'White' to the end of the set");
        printSortedSet(tree.tailSet("White"));
        System.out.printf("The first element of the sorted set is: %s%n", tree.first());
        System.out.printf("The last element of the sorted set is: %s%n", tree.last());


    }


}

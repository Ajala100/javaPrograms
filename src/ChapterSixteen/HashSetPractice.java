package ChapterSixteen;

import java.util.*;

public class HashSetPractice {
    private static void printNoDuplicateElements(Collection<String> collection){
        Set<String > set = new HashSet<>(collection);
        for(String value: set){
            System.out.printf("%s ",value.toUpperCase());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String [] array = {"red", "Blue", "Blue", "white", "pink", "Black", "Purple", "red",
        "white"};
        List<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.printf("Array content before being passed into a Set: %n%s%n", list);
        System.out.println("Array contents after being passed into a Set: ");
        printNoDuplicateElements(list);


    }
}

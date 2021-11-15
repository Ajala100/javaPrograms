package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    private static void printSearchResults(List<String> list, String key){
        //int result = 0;
        System.out.printf("searching for: %s%n", key);
        int result = Collections.binarySearch(list, key);
        if (result >= 0)
            System.out.printf("Found at index: %d%n", result);
        else
            System.out.printf("Not found %d%n", result );

    }
    public static void main(String[] args) {
        String [] colors = {"red", "white", "blue", "black", "yellow", "purple", "tan", "pink"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));
        Collections.sort(list);
        System.out.printf("Sorted ArrayList after calling method sort is: %s%n", list);
        printSearchResults(list, "black");
        printSearchResults(list, "blue");
        printSearchResults(list, "red");
        printSearchResults(list, "pink");
        printSearchResults(list, "aqua");
        printSearchResults(list, "gray");
        printSearchResults(list, "teal");
        printSearchResults(list, "bbb");
        printSearchResults(list, "bbd");
        printSearchResults(list, "bbc");
        printSearchResults(list, "bba");
        printSearchResults(list, "teal");



    }
}

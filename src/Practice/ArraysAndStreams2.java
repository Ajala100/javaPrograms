package Practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {
    public static void main(String[] args) {
        String [] strings = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        //display Original Strings
        System.out.printf("Original strings: %s%n", Arrays.asList(strings));
        // strings in uppercase
        System.out.printf("strings in uppercase: %s%n", Arrays.stream(strings).map(String:: toUpperCase)
                .collect(Collectors.toList()));
        //strings less than "n" (case insensitive) sorted ascending
        System.out.printf("strings less than n sorted ascending: %s%n", Arrays.stream(strings)
        .filter(s -> s.compareToIgnoreCase("n") < 0).sorted(String.CASE_INSENSITIVE_ORDER)
        .collect(Collectors.toList()));
        //descending
        System.out.printf("strings less than n sorted ascending: %s%n", Arrays.stream(strings)
                .filter(s -> s.compareToIgnoreCase("n") < 0).sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList()));
    }
}

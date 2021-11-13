package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {
    public static void main(String[] args) {
        Character [] characters = {'A', 'B', 'C'};
        List<Character> list = Arrays.asList(characters);
        System.out.printf("list contains: %s%n", list);
        Collections.reverse(list);
        System.out.printf("List elements in reverse are: %s%n", list);
        System.out.printf("Max in list is: %s, ", Collections.max(list));
        System.out.printf("Minimum in list is: %s%n", Collections.min(list));

        Character [] lettersCopy = new Character[3];
        List <Character> copyList = Arrays.asList(lettersCopy);
        Collections.copy(copyList, list);
        System.out.printf("After copying, copyList contains: %s%n", copyList);
        System.out.printf("Max in copyList is: %s, ", Collections.max(copyList));
        System.out.printf("Min in copyList is: %s%n ", Collections.min(copyList));

        Collections.fill(list, 'D');
        System.out.printf("After calling fill, List contains: %s%n", list);

    }
}

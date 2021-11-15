package Practice;

import java.util.List;

public class BinarySearchAlgorithm {
    public static int binarySearch(List<Integer> list, int target){
        int last = list.size();
        int middle = last / 2;
        int first = 1;
        int newMiddle1 = last + (middle + 1);
        int newMiddle2 = first + (middle - 1);
        if (list.get(middle) == target)
            return middle;
        while(newMiddle1/2 !=0 || newMiddle2/2 != 0){
            if (target > list.get(middle)){
                middle = newMiddle1 /2;
            }
            if (target < list.get(middle))
                middle = newMiddle2 /2;
            list.get(middle);
            if (list.get(middle) == target)
                return middle;
        }
        return middle;
    }
    public static void main(String[] args) {

    }
}

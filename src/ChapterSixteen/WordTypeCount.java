package ChapterSixteen;

import java.util.*;

public class WordTypeCount {
    public static void createMap(Map<String, Integer> map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String sentence = scanner.nextLine();
        String [] token = sentence.split(" ");
        for(String word: token){
            if(map.containsKey(word)){
                int count = map.get(word);
                map.put(word, count+1);
            }else map.put(word, 1);
        }
    }

    public static void displayMap(Map<String, Integer> map){
        Set<String> set = map.keySet();
        TreeSet<String> sortedSet = new TreeSet<>(set);
        System.out.printf("Map Contains: %n%-10s%10s%n", "Key", "Value");
        if(!map.isEmpty()){
            for(String key: sortedSet){
                System.out.printf("%- 10s%10s%n", key, map.get(key));
            }
        }else System.out.println("Map is empty");
        System.out.printf("Map size: %d", map.size());
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        createMap(map);
        displayMap(map);
    }
}

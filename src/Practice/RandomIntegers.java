package Practice;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        System.out.println("random numbers on separate lines: ");
        randomNumbers.ints(10,1,7).forEach(System.out::println);
        String numbers = randomNumbers.ints(10,1,7).mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.printf("%nRandom numbers on one line: %s%n", numbers);
    }
}

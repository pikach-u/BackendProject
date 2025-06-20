//0620 Stream

import java.util.Arrays;
import java.util.List;

public class Main_0620 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int result = numbers.stream()
                .filter((n) -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(result);

    }
}
//0619 Stream

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main_0619 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        Stream<Integer> stream = numbers.stream();
        numbers.stream().filter((n) -> n % 2 == 0); //2, 4

    }
}

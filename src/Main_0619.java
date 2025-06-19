//0619 Generic

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_0619 {

    public static void printElements(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<String> words = Arrays.asList("A", "B", "C");

        printElements(numbers);
        printElements(words);
    }
}

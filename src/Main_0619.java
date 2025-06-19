//0619 Generic

import java.util.ArrayList;
import java.util.List;

class Box {
    public static <T> void displayArray(List<T> array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

}

public class Main_0619 {
    public static void main(String[] args) {
//        Integer[] numbers = {1, 2, 3, 4, 5};
//        String[] words = {"apple", "banana", "cherry"};
//        Box.displayArray(numbers);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        Box.displayArray(numbers);


//        String[] words = {"apple", "banana", "cherry"};
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        Box.displayArray(words);

    }
}

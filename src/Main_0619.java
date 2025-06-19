//0619 Generic

import java.util.ArrayList;
import java.util.Arrays;
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

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);     //Immutable Object
        Box.displayArray(numbers);

//        numbers.add(6);     //X
//        numbers.remove(3);  //X
//        Box.displayArray(numbers);

        List<Integer> number = new ArrayList<>(List.of(1, 2, 3, 4, 5));     //mutable Object
        number.add(6);
        Box.displayArray(number);


//        String[] words = {"apple", "banana", "cherry"};
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");

        List<String> word = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        Box.displayArray(words);
        Box.displayArray(word);

    }
}

//0619 Generic

class Box {
    public static <T> void displayArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

}

public class Main_0619 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] words = {"apple", "banana", "cherry"};

        Box.displayArray(numbers);
        Box.displayArray(words);
    }
}

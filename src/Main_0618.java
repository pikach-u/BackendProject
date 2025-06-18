//0618 List

import java.util.*;

public class Main_0618 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        if (fruits.size() > 0) {
            System.out.println("리스트에 항목이 있습니다.");
        }

    }
}

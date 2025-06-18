//0618 Set

import java.util.*;

public class Main_0618 {
    public static void main(String[] args) {

        Set<String> fruits = new LinkedHashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");

        for (String fruit : fruits) //출력 순서가 O
            System.out.println(fruit);
    }
}

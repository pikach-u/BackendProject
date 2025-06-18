//0618 Set

import java.util.*;

public class Main_0618 {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");    //중복 X
        fruits.add("banana");
        fruits.add("apple");    //대소문자 구분
        fruits.add("Kiwi");
        fruits.add("kiwi");

        for (String fruit : fruits) //출력 순서가 O
            System.out.println(fruit.hashCode());
    }
}

//0618 List

import java.util.*;

public class Main_0618 {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Tomato");
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Potato");
        fruits.add("Dragonfruit");

        fruits.remove("Tomato"); // 값으로 삭제
        fruits.remove(5);         // 인덱스로 삭제 (0번째 요소 삭제

        for(String fruit : fruits)
            System.out.println(fruit);

        System.out.println(fruits.isEmpty());

        fruits.clear();

        System.out.println(fruits.isEmpty());
    }
}

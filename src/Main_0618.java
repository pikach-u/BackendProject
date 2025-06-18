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

        int index = fruits.indexOf("Banana");
        fruits.set(1, "Orange"); // 1번 인덱스 값을 "Orange"로 수정
        System.out.println(fruits.get(1));
        List<String> sliced = fruits.subList(0, 2); // 0번부터 1번까지 추출 (2는 미포함)

//        int index = fruits.indexOf("Banana");
//        System.out.println(index);

        for(String fruit : fruits)
            System.out.println(fruit);


    }
}

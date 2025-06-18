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

        List<String> subFruits = fruits.subList(2, 4);

        for (String fruit : fruits)
            System.out.println(fruit);

        for (String subFruit : subFruits)
            System.out.println(subFruit);


    }
}

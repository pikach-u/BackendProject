//0618 List

import java.util.*;

public class Main_0618 {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dragonfruit");
        fruits.add("Mango");

        Collections.sort(fruits);

        for(String fruit : fruits)
            System.out.println(fruit);
    }
}

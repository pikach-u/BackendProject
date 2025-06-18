//0618 Set

import java.util.*;

public class Main_0618 {
    public static void main(String[] args) {

        List<String> listFruits = new ArrayList<>();
        Set<String> fruits = new HashSet<>();

        listFruits.add("Apple");
        listFruits.add("Apple");    //중복 가능
        listFruits.add("Pear");

        for (String listFruit : listFruits)
            System.out.println(listFruit);


        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");    //중복 X
        fruits.add("banana");
        fruits.add("apple");    //대소문자 구분
        fruits.add("Kiwi");
        fruits.add("kiwi");

//        Iterator<String> it = fruits.iterator();
//        while(it.hasNext()) {
//            String item = it.next();
//            System.out.println(item);
//        }     //아래 코드와 같은 동작

        for (String fruit : fruits) //출력 순서가 O
            System.out.println(fruit);
    }
}

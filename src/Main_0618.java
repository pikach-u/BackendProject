//0618 List

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main_0618 {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dragonfruit");
        fruits.add("Mango");

//        for(int i = 0; i< fruits.size(); i++)
//            System.out.println(fruits.get(i));


//        Iterator<String> it = fruits.iterator();
//        while (it.hasNext()) {
//            String item = it.next();
//            System.out.println(item);
//        }     // 아래와 똑같이 동작


        for(String fruit : fruits)
            System.out.println(fruit);
    }
}

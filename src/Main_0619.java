//0619 Map

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main_0619 {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new TreeMap<>();

        fruitPrices.put("사과", 17980);
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("멜론", 10630);

        System.out.println(fruitPrices.containsKey("사과"));
        System.out.println(fruitPrices.containsValue(9999));
        System.out.println(fruitPrices.getOrDefault("멜론", 3000));
        System.out.println(fruitPrices.getOrDefault("포도", 5000));

        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}

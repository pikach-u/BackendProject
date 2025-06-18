//0618 Map

import java.util.*;

public class Main_0618 {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("사과", 17980);
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 14900);
        fruitPrices.put("멜론", 10630);

        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + " costs " + entry.getValue() + "원"); //값 꺼내기
        }

        double cost = 0;

        for (int fruitPrice : fruitPrices.values()) {
            cost += fruitPrice;
            // System.out.println(fruitPrice);
        }

        System.out.println(cost / fruitPrices.size());

    }
}

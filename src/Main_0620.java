//0620 Stream

import java.util.Arrays;
import java.util.List;

public class Main_0620 {
    public static void main(String[] args) {
        List<Double> values = Arrays.asList(10.0, 20.0, 30.0);

        double avg = values.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);   //안전장치

        System.out.println(avg);

    }
}
//0619 Generic

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_0619 {

    public static double sumList(List<? extends Number> list) {
        double sum = 0;

        for (Number n : list) {
            sum += n.doubleValue();

        }
        for (Number n : list) {
            sum += n.doubleValue();

            if (n instanceof Integer) {
                Integer.toHexString((Integer) n);
            } else if (n instanceof Double) {

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30);
//        List<Double> doubleList = Arrays.asList(0.1, 0.2);

        System.out.println("합계: " + sumList(intList));
    }
}

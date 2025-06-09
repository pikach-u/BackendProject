//0609 Arrays

import java.lang.reflect.Array;

public class Main_0609 {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }
        System.out.println(num.length);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }

        num[2] = 99;    //값 수정 가능

        int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

    }
}

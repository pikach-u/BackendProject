//0604 While

import java.sql.SQLOutput;

public class Main_0604 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        boolean a = true;
        int b = 1;
        while (a) {
            System.out.println(b);
            b++;

            if (b > 10000) {    //조건 만족 시 탈출
                a = false;
            }
        }

        int input = 5;
        do {
            System.out.println("자판기입니다");

            switch (input) {
                case 1:
                    System.out.println("콜라");
                    break;
                case 2:
                    System.out.println("사이다");
                    break;
                case 3:
                    System.out.println("물");
                    break;
                default:
                    System.out.println("꽝");
            }
            input = 0;
        } while (input != 0);

    }
}

//0611 계산기만들기

import java.util.Scanner;

public class Main_0611 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //상수로 사칙연산 정의
        final String PLUS = "+";
        final String MINUS = "-";
        final String MULTIPLY = "*";
        final String DIVISION = "/";

        double a = 0;    //왼쪽 피연산자
        double b = 0;    //오른쪽 피연산자
        String op;          //연산자
        double answer = 0;  //답


        System.out.println("========계산기=========");
        System.out.println("두 수를 입력해주세요.");
        System.out.println("======================");

        //계산할 숫자 입력
        System.out.println("첫 번째 숫자: ");
        a = scanner.nextDouble();

        System.out.println("두 번째 숫자: ");
        b = scanner.nextDouble();

        System.out.println("1. + 2. - 3. * 4. /");

        while (true) {

            op = scanner.next();

            switch (op) {
                case PLUS:
                    answer = a + b;
                    break;
                case MINUS:
                    answer = a - b;
                    break;
                case MULTIPLY:
                    answer = a * b;
                    break;
                case DIVISION:
                    answer = a / b;
                    break;
                default:
                    System.out.println("다시 입력해주세요");
                    continue;
            }
            break;
        }

        System.out.printf("답은 %.2f입니다.\n", answer);

    }
}

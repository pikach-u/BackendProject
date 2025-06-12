//0611 계산기만들기

import java.util.Scanner;

public class Main_0611 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //상수로 연산자 정의
        final String PLUS = "+";
        final String MINUS = "-";
        final String MULTIPLY = "*";
        final String DIVISION = "/";
        final String END = "#";

        double num1 = 0;    //왼쪽 피연산자
        double num2 = 0;    //오른쪽 피연산자
        String op;          //연산자
        double answer = 0;  //답


        System.out.println("========계산기=========");

        while (true) {
            System.out.println("두 수를 입력해주세요.");
            System.out.println("======================");

            //계산할 숫자 입력
            System.out.println("첫 번째 숫자: ");
            num1 = scanner.nextDouble();

            System.out.println("두 번째 숫자: ");
            num2 = scanner.nextDouble();

            //연산자 입력
            System.out.println("1. + 2. - 3. * 4. / (종료: #)");
            op = scanner.next();

            switch (op) {
                case PLUS:
                    answer = num1 + num2;
                    break;
                case MINUS:
                    answer = num1 - num2;
                    break;
                case MULTIPLY:
                    answer = num1 * num2;
                    break;
                case DIVISION:
                    if (num2 != 0) {
                        answer = num1 / num2;
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                        continue;
                    }
                    break;
                case END:
                    return;
                default:
                    System.out.println("다시 입력해주세요");
                    continue;
            }

            System.out.printf("답은 %.2f입니다.\n", answer);

        }

    }
}

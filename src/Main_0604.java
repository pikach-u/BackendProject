//0604 For-Loop

public class Main_0604 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        int num = 5;
        for (int i = 1; i <= 9; i++) {  //5단 출력
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        for (int i = 1; i <= 19; i++) {
            if (i >= 5) {   //5단의 5부터 19까지 실행
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {   //2의 배수 출력
                System.out.println(i);
            }
        }

        for (int i = 20; i >= 1; i--) {
            if (i % 4 == 0) {   //4의 배수를 20부터 거꾸로 출력
                System.out.println("i는 " + i);
            }
        }

        //이중 for문
        for (int i = 1; i <= 9; i++) {
            System.out.println("구구단 " + i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }


    }
}

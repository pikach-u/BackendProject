//0605 break-continue

public class Main_0605 {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i >= 15) {
                break;
            }

            if (i % 5 == 0) {
                continue;
            }

            System.out.println(i);
        }

        for (int i = 1; i <= 1000; i++) {
            if (i % 2 != 0 || i % 3 != 0) { // 6의 배수 찾기
                if (i == 100) {
                    break;
                }
                continue;
            }

            System.out.println(i);
        }

    }
}

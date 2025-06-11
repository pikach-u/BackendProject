//0611 자판기만들기

import java.util.Scanner;

public class Main_0611 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //입력 값에 따른 조건문
        //if문 (숫자 비교), 스위치 (값만 체크)

        int price = 0;
        String item = "";

        while (true) {

            System.out.println("=== 자판기 메뉴 ===");
            System.out.println("1. Melon Soda (800원)");
            System.out.println("2. Cider (2110원)");
            System.out.println("3. Coke (2000원)");
            System.out.println("4. Juice (3000원)");
            System.out.println("5. Coffee (5500원)");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    item = "Melon Soda";
                    price = 800;
                    break;
                case 2:
                    item = "Cider";
                    price = 2110;
                    break;
                case 3:
                    item = "Coke";
                    price = 2000;
                    break;
                case 4:
                    item = "Juice";
                    price = 3000;
                    break;
                case 5:
                    item = "Coffee";
                    price = 5500;
                    break;
                default:
                    System.out.println("다시 선택해주세요");
                    continue;
                    //return; //return시 switch문 밖 로직은 실행안됨
            }
            break;
        }

        System.out.println(item + "을 선택하셨습니다. 가격은 " + price + "원입니다.");
        int money = scanner.nextInt();

        while (true) {
            if (money < price) {
                System.out.println("금액이 부족합니다. 추가 투입해주세요");
                money += scanner.nextInt();

            } else {
                int change = money - price; //잔돈
                System.out.printf("%s의 거래가 완료되었습니다. 잔돈: %d\n", item, change);
                return;
            }
        }

    }
}

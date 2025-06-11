//0611 Scanner

import java.util.Scanner;

public class Main_0611 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println(name);

        int age = scanner.nextInt();
        System.out.println(age);

        char thirdChar = scanner.next().charAt(3);
        System.out.println(thirdChar);

        System.out.println("프로그램 종료");

    }
}

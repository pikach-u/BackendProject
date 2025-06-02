//0602 Compound assignment operator

public class Main_0602 {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        a += 5; // a = a+5

        System.out.println(a);

        b -= 1;
        System.out.println(b); // 2

        b *= 4;
        System.out.println(b); // 8

        b /= 3;
        System.out.println(b); // 2

        b %= 2;
        System.out.println(b); // 0

    }
}

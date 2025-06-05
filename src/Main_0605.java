//0605 Return

public class Main_0605 {
    public static int addNum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int addNum1(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {
        int num = addNum(10, 7);

        System.out.println(num);
    }
}

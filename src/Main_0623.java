public class Main_0623 {
    public static int getProductAbs(int x, int y) {
        int result = x * y;

        if (result < 0) {
            return Math.abs(result);
        } else return result;
    }

    public static void main(String[] args) {
        System.out.println(getProductAbs(10, 20));      // 200
        System.out.println(getProductAbs(20, -40));     // 800
    }
}

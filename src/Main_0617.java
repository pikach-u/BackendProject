//0617 finally

public class Main_0617 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error");

        } finally {   //항상 실행
            System.out.println("Clean Up");
        }
    }
}

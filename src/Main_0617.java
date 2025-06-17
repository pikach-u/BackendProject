//0617 try-catch

public class Main_0617 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Error: Division by zero");
        }
    }
}

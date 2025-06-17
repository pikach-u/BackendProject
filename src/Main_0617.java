//0617 Lambda function

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Main_0617 {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;

        System.out.println(add.operate(2,4));
        System.out.println(multiply.operate(3,5));
    }
}

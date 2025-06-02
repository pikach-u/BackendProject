//0602 constant-variable

public class Main_0602 {
    public static void main(String[] args) {

        final int a = 10;
        System.out.println(a);
        a = 11;     // error: cannot assign a value to final variable
        System.out.println(a);

    }
}

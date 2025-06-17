//0617 Parse

public class Main_0617 {
    public static void main(String[] args) {
        String input = "123a";

        try {
            int number = Integer.parseInt(input);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("숫자 포맷이 아닙니다.");
        }
    }
}

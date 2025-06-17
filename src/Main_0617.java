//0617 finally

public class Main_0617 {
    public static void main(String[] args) {
        String input = "123a";

        try {
            int number = Integer.parseInt(input);
            System.out.println("Parse Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Unable to parse the input");

        } finally {   //항상 실행
            System.out.println("Process completed.");
        }
    }
}

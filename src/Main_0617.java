//0617 throws

public class Main_0617 {
    public static void main(String[] args) {
        String strNum = "123a";

        try {
            int num = convertToInt(strNum);
            System.out.println("result: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Format Error!");
        }
    }

    public static int convertToInt(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }
}

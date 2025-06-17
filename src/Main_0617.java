//0617 split

public class Main_0617 {
    public static void main(String[] args) {
        String input = "100";

        try {
            boolean result = validateTokenCount(input);

            if (result) {
                System.out.println("two");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }

    public static boolean validateTokenCount(String tokens) throws NumberFormatException {
        if (tokens.length() != 2) {
            throw new NumberFormatException("Not 2");
        }

        return true;
    }
}

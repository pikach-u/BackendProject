//0605 Return

public class Main_0605 {

    public static void main(String[] args) {
        char asciiChar = 'A';
        System.out.println("Character: " + asciiChar);

        int asciiCode = (int) asciiChar;    //casting
        System.out.println("ASCII Code: " + asciiCode);

        char koreanChar = '가';
        System.out.println("Character: " + koreanChar);

        int unicodeChar = (int) koreanChar;
        System.out.println("Unicode Code: U+" + Integer.toHexString(unicodeChar).toUpperCase());
    }
}

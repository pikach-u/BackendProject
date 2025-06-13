//0613 Access-Modifiers

public class Main_0613 {
    public static String publicField = "나는 퍼블릭 하다.";

    public static void main(String[] args) {
        System.out.println(publicField);
    }
}

class Child extends Main_0613 {
    public Child() {
        System.out.println(Main_0613.publicField);
    }
}

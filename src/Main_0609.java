public class Main_0609 {
    public static void greet() {
        System.out.println("Hello World!");
    }

    public static void greet (String name){
        System.out.println("Hello " + name + "!");
    }

    public static void main(String[] args) {

        greet();
        greet("Alice");
    }
}

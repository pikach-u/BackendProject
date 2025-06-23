//0623 Annotation_Reflection

@FunctionalInterface
interface Greeting{
    void sayHello(String name);
}

public class Main_0623 {
    public static void main(String[] args) {
        Greeting greeting = (name) -> System.out.println("Hello" + name + "!");
        greeting.sayHello(" Alice");
    }
}

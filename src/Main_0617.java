//0617 Lambda can be replaced with method reference

class Util {
    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}

@FunctionalInterface
interface A{
    public void say(String name);
}

public class Main_0617 {
    public static void main(String[] args) {
        // A a = (name) -> Util.sayHello(name); //Lambda
        A a = Util::sayHello;   //Method Reference
        a.say("Hachiware");
    }
}

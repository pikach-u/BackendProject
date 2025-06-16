class Personn{

    int a = 0;
    static int b = 1;

    public static void greet(){
        System.out.println("Hello from static Method");
    }

    public void sayHello(){
        System.out.println("Hello from instance Method.");
    }
}

class Utils {
    public static void sayHi() {
        System.out.println("Hi!");
    }
}

public class Main_0616 {
    public static void main(String[] args){
        Personn.greet();    // 인스턴스 없이 호출 가능

        Personn p = new Personn();
        p.sayHello();
        p.greet();
    }
}

//0616 AnonymousClass

interface Greeting{
    void greet();
}

public class Main_0616 {    //Outter
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {    //AnonymousClass
            @Override
            public void greet() {
                System.out.println("Hello from Anonymous Class");
            }
        };

        greeting.greet();

    }
}
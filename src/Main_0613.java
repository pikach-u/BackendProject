//0613 abstract-classes

abstract class Animall{
    abstract void makeSound();

    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Dogg extends Animall {
    @Override
    void makeSound() {
        System.out.println("멍멍!");
    }
}


public class Main_0613 {
    public static void main(String[] args) {
        Animall dog = new Dogg();

        dog.makeSound();
        dog.sleep();
    }
}

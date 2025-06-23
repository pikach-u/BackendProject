//0623 Annotation_Reflection

class Animall {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dogg extends Animall {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

public class Main_0623 {
    public static void main(String[] args) {
        Animall dog = new Dogg();
        dog.sound();
    }
}

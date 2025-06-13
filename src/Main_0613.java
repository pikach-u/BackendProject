//0613 interfaces

interface Animall{
    void makeSound();
}

class Dogg implements Animall{
    @Override
    public void makeSound(){
        System.out.println("멍멍");;
    }
    public void print(){
        System.out.println("barkkk");
    }
}

public class Main_0613 {
    public static void main(String[] args) {
        Animall dog = new Dogg();

        dog.makeSound();

        if(dog instanceof Dogg) {
            Dogg newDog = new Dogg();

            newDog.makeLoud();
        }
    }
}

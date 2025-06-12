//0612 Override
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("name: " + name);
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void printName() {
        System.out.println("name: " + name + " breed: " + breed);
    }
}

public class Main_0612 {
    public static void main(String[] args) {
        Animal dog = new Dog("쭈", "댕댕이");
        dog.printName();
    }
}

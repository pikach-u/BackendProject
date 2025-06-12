//0612 Override
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

}

class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void printName() {
        System.out.println("name: " + name + " breed: " + breed);
    }
}

public class Main_0612 {
    public static void main(String[] args) {
        Animal dog = new Dog("쭈", "댕댕이");

        if(dog instanceof Dog) {
            Dog newDog = (Dog) dog;     //부모 타입을 자식 타입으로 캐스팅 (다운캐스팅)

            newDog.printName();
        }
    }
}

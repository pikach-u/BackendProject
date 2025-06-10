//0610 Constructors

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void hello() {
        System.out.println("hello");
    }
}

public class Main_0610 {
    public static void main(String[] args) {

        Person person = new Person("h662", 18);

        person.hello();
    }
}

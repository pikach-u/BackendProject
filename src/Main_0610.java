//0610 Constructors

class Person {
    String name;
    int age;

    public Person(String inputName, int inputAge) {
        name = inputName;
        age = inputAge;
    }

    void hello() {
        System.out.println("hello");
    }
}

public class Main_0610 {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.name = "h662";
//        person.age = 18;

        Person person = new Person("h662", 18);

        person.hello();
    }
}

//0610 Class

class Person {
    String name;
    int age;
    String MBTI;

    public void sayHello(){
        System.out.println("안녕하세요? 저는 " + name + "입니다. 저의 나이는 " + age + "세 입니다.");
    }

    public void work(){
        System.out.println("일하는 중..");
    }
}

class Car{
    String brand;
    int year;

    public void displayInfo(){
        System.out.println("이 차의 브랜드는 " + brand + ", 연식은 " + year+"년");
    }
}



public class Main_0610 {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "pikachu";
        person.age = 25;
        person.MBTI = "ENFP";

        person.sayHello();
        person.work();

        Person mzPerson = new Person();

        mzPerson.name = "metamong";
        mzPerson.age = 18;
        mzPerson.MBTI = "ISFJ";

        Car car = new Car();
        car.brand = "BMW";
        car.year = 15;
        car.displayInfo();

        int[] nums = {1,2,3,4};
        String name = "pikachu";
        System.out.println(nums.length);
        System.out.println(name.length());


    }
}

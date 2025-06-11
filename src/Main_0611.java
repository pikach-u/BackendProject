//0611 Constructors

class Person1{
    String name;
    int age;

    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Car{
    String brand;
    int year;

    public Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo(){
        System.out.println("이 차는 " + brand + "이고, 연식은 " + year + "년입니다.");
    }
}

public class Main_0611 {
    public static void main(String[] args){
        Person1 p1 = new Person1("꿀꽈배기", 23);
        Person1 p2 = new Person1("우사기", 34);

        Car car = new Car("BMW", 23);
        car.displayInfo();
    }
}

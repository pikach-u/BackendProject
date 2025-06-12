//0612 Inheritance

class Animal{
    String name;

    public Animal(String name){    //생성자
        this.name = name;
    }

    public void printName(){
        System.out.println("Animal name: " + this.name);
    }
}

class Dog extends Animal{
    String breed;

    public Dog(String name, String breed){
        super(name);        //부모 클래스의 객체에 먼저 값을 넣어주어야 함(?)
        this.breed = breed;
        //super.name = name;
    }

}

//class Dog{                //위 코드와 기능이 같음
//    String name;          //상속의 기능: 중복코드 제거 효과
//}

class Vehicle{
    String brand;

    public Vehicle(String brand){
        this.brand = brand;
    }

    public void display(){
        System.out.println("brand: " + this.brand);
    }
}

class Car extends Vehicle{
    String model;

    public Car(String brand, String model){
        super(brand);
        this.model = model;
    }
    public void display(){
        System.out.println("brand: " + this.brand + " " + this.model);
    }

}



public class Main_0612 {
    public static void main(String[] args) {
        Dog dog = new Dog("쭈", "댕댕이");
        dog.printName();

        Vehicle ve = new Vehicle("train");
        Car car = new Car("BMW", "Beetle");

        ve.display();
        car.display();
    }
}

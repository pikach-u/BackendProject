//0616 inner class

class Car {
    String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    class Engine {
        public void start() {
            System.out.println("The engine of " + brand + " is starting.");
        }
    }

    public void startEngine() {
        Engine engien = new Engine();
        engien.start();
    }
}

public class Main_0616 {
    public static void main(String[] args) {

        Car car = new Car("빠른자동차");

        car.startEngine();
    }
}
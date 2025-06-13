//0613 polymorphism

abstract class Shape {
    public abstract double area();

}

class Circle extends Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {

    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }
}

public class Main_0613 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4, 5);

        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }
}

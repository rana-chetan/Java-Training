package abstraction.Interface;

public class Circle implements Shape {

    double radius = 5;

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}

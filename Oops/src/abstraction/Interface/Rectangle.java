package abstraction.Interface;

public class Rectangle implements Shape {

    double length = 4;
    double width = 3;

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public double area() {
        return length * width;
    }
}

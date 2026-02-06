package abstraction.Interface;

public class Main {

    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();
        System.out.println("Area: " + s1.area());

        s2.draw();
        System.out.println("Area: " + s2.area());
    }
}

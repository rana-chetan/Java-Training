package abstraction.abstract_class;

public class Main {

    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.message();
        s1.draw();

        s2.message();
        s2.draw();
    }
}

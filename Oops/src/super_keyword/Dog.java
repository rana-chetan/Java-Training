package super_keyword;

public class Dog extends Animal {

    String color = "Black";

    void displayColor() {
        System.out.println("Dog color: " + color);
        System.out.println("Animal color: " + super.color);
    }

    void eat() {
        super.eat();
        System.out.println("Dog is eating");
    }
}

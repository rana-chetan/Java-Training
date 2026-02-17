package lambda_expression;

// Types To Implement Functional Interface
// 1. Using Normal Class
// 2. Using Anonymous Class
// 3. Using Lambda Expression

public class Main {

    public static void main(String[] args) {

        //way one to implement functional interface method using normal class
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.show();

        //way two to implement functional interface method using anonymous class
        MyInterface myInterface1 = new MyInterface() {
            @Override
            public void show() {
                System.out.println("Implementation of show method using anonymous class");
            }
        };

        myInterface1.show();

        //way three to implement functional interface method using lambda expression
        MyInterface myInterface2 = () -> System.out.println("Implementation of show method using lambda expression");
        myInterface2.show();
    }
}

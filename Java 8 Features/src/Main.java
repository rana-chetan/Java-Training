import lambda_expression.MyInterface;
import lambda_expression.MyInterfaceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        //way one to implement functional interface method
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
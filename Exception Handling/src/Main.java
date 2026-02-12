// This code demonstrates the use of try-catch-finally blocks in Java to handle exceptions.

public class Main {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } finally {
            System.out.println("Program execution completed");
        }
    }
}

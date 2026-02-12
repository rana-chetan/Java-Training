package lambda_expression.sum_Interface;

public class Main {

    public static void main(String[] args) {

        sum sum1 = (a, b) -> a + b;
        int result = sum1.add(5, 10);
        System.out.println("The sum is: " + result);

    }
}

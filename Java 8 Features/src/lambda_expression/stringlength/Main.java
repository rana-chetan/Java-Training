package lambda_expression.stringlength;

// Lambda Expression for Finding the Length of a String using Functional Interface

public class Main {

    public static void main(String[] args) {

        FindLength findLength = (str) -> str.length();

        System.out.println(findLength.length("Hi I am Chetan Rana"));
    }
}

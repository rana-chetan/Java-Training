package lambda_expression.stringlength;

// Create a functional interface to find the length of a string.

@FunctionalInterface
public interface FindLength {

    public abstract int length(String str);
}

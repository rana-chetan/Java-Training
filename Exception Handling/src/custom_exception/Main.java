package custom_exception;

// Main class to test the custom exception

public class Main {

    // Method to check age and throw custom exception if age is less than 18
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid for voting");
        } else {
            System.out.println("You are eligible for voting");
        }
    }

    public static void main(String[] args) {

        // Test the checkAge method with an invalid age
        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            // Handle the custom exception and print the message
            System.out.println(e.getMessage());
        }
    }
}

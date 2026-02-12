package optional_interface;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        //What is Optional Interface in Java?
        //Optional interface is a container object which may or may not contain a non-null value.
        //If a value is present, isPresent() will return true and get() will return the value.
        //It is introduced in Java 8 and is part of java.util package.

        Optional<String> str = Optional.of("Hello World");

        if (str.isPresent()) {
            System.out.println(str.get());
        } else {
            System.out.println("Value is not present");
        }

//        str.orElse("Value is not present");

    }
}

package class_objects;

public class Main {

    public static void main(String[] args) {

        // Object of Student class created
        Student s1 = new Student();

        // set values using object reference variable
        s1.rollNumber = 1;
        s1.name = "Rahul";

        // call method using object reference variable
        s1.displayDetails();
    }
}

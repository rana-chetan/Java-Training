package constructor_overloading;

public class Student {

    int rollNumber;
    String name;

    Student() {
        rollNumber = 0;
        name = null;
    }

    Student(int r) {
        rollNumber = r;
        name = null;
    }

    Student(int r, String n) {
        rollNumber = r;
        name = n;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}

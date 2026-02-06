package constructor;

public class Student {

    int rollNumber;
    String name;

    // Constructor
    Student(int r, String n) {
        rollNumber = r;
        name = n;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}

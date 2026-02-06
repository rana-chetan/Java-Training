package this_keyword;

public class Student {

    int rollNumber;
    String name;

    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}

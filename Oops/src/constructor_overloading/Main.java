package constructor_overloading;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(1);
        Student s3 = new Student(2, "Rahul");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}

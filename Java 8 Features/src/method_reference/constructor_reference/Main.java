package method_reference.constructor_reference;

public class Main {

    public static void main(String[] args) {

        //Constructor reference = refers to constructor without executing it
        //ClassName::new

//        //Without constructor method reference
//        Provider provider = () -> {
//            return new Student();
//        };
//
//        Student student = provider.getStudent();
//        student.show();

        //With constructor method reference
        Provider provider1 = Student::new;
        Student student = provider1.getStudent();
        student.show();
    }
}

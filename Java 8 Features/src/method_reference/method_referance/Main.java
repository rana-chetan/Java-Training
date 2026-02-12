package method_reference.method_referance;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Task interface ni implement karva mate lambda expression ni jagyae method reference use kariye
        //Method reference = refers to method without executing it
        //ClassName::MethodName

        //Static method reference
        Task task = Stuff::doStuff;
        task.doTask();

        //Non-static method reference
        Stuff stuff = new Stuff();
        Task task1 = stuff::printOneToHundred;
        task1.doTask();

        //method reference demo using Stream API
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(list);

        list.forEach(System.out::println);

        list.stream().forEach(System.out::println);
    }

}

package Stream_API;

import java.util.List;

public class Methods {

    public static void main(String[] args) {

        //Stream() methods
        //1- filter() - used to filter data based on condition
        //2- map() - used to map data to another format
        //3- sorted() - used to sort data in ascending order
        //4- min() - used to find minimum value
        //5- max() - used to find maximum value
        //6- collect() - used to collect data into a collection
        //7- forEach() - used to iterate over data
        //8- toList() - used to convert stream to list
        //9- toArray() - used to convert stream to array

        //1- filter()
        List<String> names = List.of("Java", "Python", "C++", "JavaScript", "Ruby", "Go", "Swift");
        System.out.println("Start Word With 'J' Letter: " + names.stream().filter(e -> e.startsWith("J")).toList());

        //2- map()
        List<Integer> numbers = List.of(2, 45, 88, 42, 96, 73, 20);
        System.out.println("Square of list: " + numbers.stream().map(e -> e * 2).toList());

        //3- sorted()
        System.out.println("sorted list: " + numbers.stream().sorted().toList());

        //4- min()
        Integer i = numbers.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println("minimum number of list: " + i);

        //5- max()
        Integer j = numbers.stream().max((a, b) -> a.compareTo(b)).get();
        System.out.println("maximum number of list: " + j);
    }

}

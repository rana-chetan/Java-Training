package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, 45, 88, 42, 96, 73, 20);

        List<Integer> evenNumbers = new ArrayList<>();

//        //Without Stream API
//        for(Integer number : numbers){
//            if(number % 2 == 0){
//                evenNumbers.add(number);
//            }
//        }
//
//        System.out.println(numbers);
//        System.out.println(evenNumbers);

        //With Stream API
        Stream<Integer> stream = numbers.stream();

        //print even numbers using filter and toList method
        List<Integer> list = stream.filter((i -> i % 2 == 0)).toList();

        System.out.println(numbers);
        System.out.println(list);

        System.out.println("--------------------------------------------------------------");

        //print grater than 50 numbers using filter and collect method
        Stream<Integer> stream1 = numbers.stream();

        System.out.println(stream1.filter((i -> i > 50)).collect(Collectors.toList()));
    }

}

package stream_api;

import java.util.List;
import java.util.stream.Stream;

// How to create Stream Interface object
// Stream API = collections process
// collection/ group of object

public class StreamObject {

    public static void main(String[] args) {

        //1- blank stream - empty() method
        Stream<Object> emptyStream = Stream.empty();

        //2- from array, object, collection - of() method
        String names[] = {"Java", "Python", "C++", "JavaScript"};

        Stream<String> stream = Stream.of(names);

        stream.forEach(e -> {
            System.out.println(e);
        });

        //3- using builder() method
        Stream<Object> buildStream = Stream.builder().build();

        //4- Arrays.stream() method
        Stream<int[]> arrayStream = Stream.of(new int[]{1, 2, 3, 4, 5}); //array of int
        arrayStream.forEach(e -> {
            System.out.println(e);
        });

        //5- using collection - stream() method
        List<Integer> numbers = List.of(2, 45, 88, 42, 96, 73, 20);

        Stream<Integer> stream1 = numbers.stream();

        stream1.forEach(e -> {
            System.out.println(e);
        });
    }

}

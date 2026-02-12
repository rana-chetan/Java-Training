package Stream_API;

import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {

        //Stream API = collections process
        //collection/ group of object

        //How to create Stream Interface object

        //1- blank
        Stream<Object> emptyStream = Stream.empty();

        //2- from array, object, collection
        String names[] = {"Java", "Python", "C++", "JavaScript"};

        Stream<String> stream = Stream.of(names);

        stream.forEach(e -> {
            System.out.println(e);
        });

        //3- using builder()
        Stream<Object> buildStream = Stream.builder().build();

        //4- Arrays.stream()
        Stream<int[]> arrayStream = Stream.of(new int[]{1, 2, 3, 4, 5});//array of int
        arrayStream.forEach(e -> {
            System.out.println(e);
        });
    }

}

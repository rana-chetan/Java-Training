package Practice_1;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream().map(e -> e * e).forEach(System.out::println);
    }
}

package traverse_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apples");
        list.add("Banana");
        list.add("Mango");
        list.add("Grapes");
        list.add("Orange");
        list.add("Watermelon");
        list.add("Pineapple");

        System.out.println(list);

        //for-each Loop:
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("----------------------------------------------------------");

        //traversing using ITERATOR: Forward traversing
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println("----------------------------------------------------------");

        //traversing using LIST ITERATOR: Backward traversing
        ListIterator<String> stringListIterator = list.listIterator(list.size());

        while (stringListIterator.hasPrevious()) {
            String previous = stringListIterator.previous();
            System.out.println(previous);
        }

        System.out.println("______________________________________");

        //traversing using for-each() method
        list.forEach(e -> {
            System.out.println(e);
        });

        System.out.println("______________________________________");

        //TreeSet
        System.out.println("Sorting of elements:");

        TreeSet<String> set = new TreeSet<>();
        set.addAll(list);

        set.forEach(e -> {
            System.out.println(e);
        });

    }
}

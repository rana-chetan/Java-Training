package collection;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        System.out.println("Collection Framework");

        //Creating Collection
        //1) Type Safe - same type of elements(object) are added to collection.
        //2) Un-Type Safe - different types of elements can be added to collection.

        //Type Safe collection
        ArrayList<String> arrayList = new ArrayList<>(); // Creating ArrayList

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");

        System.out.println(arrayList);

        //get() method is used to get the element at the specified index.
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(2));

        //remove() method is used to remove the element at the specified index.
        arrayList.remove("Apple");
        System.out.println(arrayList);

        //size() method is used to get the number of elements in the list.
        System.out.println("Size of List Is: " + arrayList.size());

        //contains() method is used to check if the list contains the specified element or not.
        System.out.println(arrayList.contains("Banana"));

        //isEmpty() method is used to check if the list is empty or not.
        System.out.println(arrayList.isEmpty());

        //setting value...
        arrayList.set(1, "Hello"); // --> it will replace the value at index 1 with "Hello"
        System.out.println(arrayList);

        arrayList.add(0, "Apple"); // --> it will add "Apple" at index 0 and shift the existing elements to the right
        System.out.println(arrayList);

        //remove all elements
        arrayList.clear();
        System.out.println(arrayList);

        System.out.println("----------------------------------------------------------");

        //Un-Type Safe
        LinkedList list = new LinkedList(); // Creating LinkedList

        list.add("Apples");
        list.add(123);
        list.add(210.15);
        list.add(true);

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        System.out.println("----------------------------------------------------------");

        Vector<String> vector = new Vector<>(); // Creating Vector
        vector.addAll(arrayList);

        System.out.println("Vector Is:" + vector);

        System.out.println("----------------------------------------------------------");

        HashSet<Double> nms = new HashSet<>(); // Creating HashSet
        nms.add(14.14);
        nms.add(34.123);
        nms.add(2354.235);
        nms.add(99.3);
        nms.add(5.3);

        System.out.println(nms);

        System.out.println("----------------------------------------------------------");

        TreeSet<Double> set = new TreeSet<>(); // Creating TreeSet
        set.addAll(nms);

        System.out.println(set);
    }
}

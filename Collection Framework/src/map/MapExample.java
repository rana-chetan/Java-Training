package map;

import java.util.HashMap;

public class MapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> courses = new HashMap<>(); // Creating HashMap

        //adding elements
        courses.put("Core Java", 4000);
        courses.put("Basic Python", 3500);
        courses.put("Spring", 8000);
        courses.put("Android", 4000);
        courses.put("Android", 6000);
        courses.put("PHP", 2414);

        System.out.println(courses);

        //forEach() method is used to iterate through the elements of the map.
        courses.forEach((key, values) -> {
            System.out.println(key + " -> " + values);
        });

        //get() method is used to retrieve the specified key's value from the map.
        System.out.println(courses.get("Core Java"));
    }
}

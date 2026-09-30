import java.util.*;

class CollectionDemo {
    public static void main(String[] args) {

        // List
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C++");
        list.add("Python");

        System.out.println("List: " + list);

        // Set
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println("Set: " + set);

        // Map
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Ali");
        map.put(2, "Rahul");
        map.put(3, "John");

        System.out.println("Map: " + map);
    }
}
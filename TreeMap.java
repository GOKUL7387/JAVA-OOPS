import java.util.*;

public class TreeMapOverview {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");

        System.out.println("Initial TreeMap: " + treeMap);

        // equals and hashCode
        TreeMap<Integer, String> anotherTreeMap = new TreeMap<>();
        anotherTreeMap.put(1, "One");
        anotherTreeMap.put(3, "Three");
        anotherTreeMap.put(5, "Five");
        anotherTreeMap.put(7, "Seven");

        System.out.println("TreeMap equals anotherTreeMap? " + treeMap.equals(anotherTreeMap));
        System.out.println("TreeMap hashCode: " + treeMap.hashCode());

        // isEmpty
        System.out.println("Is TreeMap empty? " + treeMap.isEmpty());

        // toString
        System.out.println("TreeMap toString: " + treeMap.toString());

        // getClass
        System.out.println("Class of TreeMap: " + treeMap.getClass());

      
        // forEach
        System.out.println("Iterating using forEach:");
        treeMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        // getOrDefault
        System.out.println("Value for key 3: " + treeMap.getOrDefault(3, "Default"));
        System.out.println("Value for key 10: " + treeMap.getOrDefault(10, "Default"));

        // putIfAbsent
        treeMap.putIfAbsent(5, "Fifty"); // Does not update as key 5 exists
        treeMap.putIfAbsent(9, "Nine");
        System.out.println("After putIfAbsent: " + treeMap);

        // remove (key)
        treeMap.remove(9);
        System.out.println("After removing key 9: " + treeMap);

        // remove (key, value)
        treeMap.remove(5, "Five"); // Removes key-value pair
        System.out.println("After removing key 5 with value 'Five': " + treeMap);

        // replace (key, value)
        treeMap.replace(3, "Third");
        System.out.println("After replacing value for key 3: " + treeMap);

        // replace (key, oldValue, newValue)
        treeMap.replace(3, "Third", "Three");
        System.out.println("After conditional replace for key 3: " + treeMap);

        // replaceAll
        treeMap.replaceAll((key, value) -> value.toUpperCase());
        System.out.println("After replaceAll: " + treeMap);
    }

  
}

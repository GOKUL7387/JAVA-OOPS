
import java.util.*;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        List<Integer> numbers=new ArrayList<Integer>();

        //Add method
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("Number list:"+numbers);

        numbers.add(2,25);
        System.out.println("Number list:"+numbers);

        //can add elements as continuous...
        List<Integer> newNumber=List.of(50, 60, 70);
        System.out.println("newNumber list:"+newNumber);

        //Add all
        numbers.addAll(newNumber);
        System.out.println("After addAll number list: "+numbers);

        //get method
        //to get an element using index...
        System.out.println("Element at index 3: "+numbers.get(3));

        //set method
        numbers.set(6,55);
        System.out.println("After setting element 55 at index 6: "+numbers);

        //Remove method by index
        numbers.remove(2);
        System.out.println("After removing element at index 2: "+numbers);

        //Remove  method by Elements
        numbers.remove(Integer.valueOf(55));
        System.out.println("After removing: "+numbers);

        //Check element Contains or not
        System.out.println("Contains: "+numbers.contains(40));

        //Check list Empty or not
        System.out.println("Empty: "+numbers.isEmpty());

        //Check the size of the Array
        System.out.println("Size: "+numbers.size());

        //To find Index
        System.out.println("Index of 10:"+numbers.indexOf(10));
        System.out.println("Index of 10:"+numbers.lastIndexOf(10));

        //Sorting

        //Ascending order
        Collections.sort(numbers);
        System.out.println("After Ascending order:"+numbers);

        //Decending order
        numbers.sort(Comparator.reverseOrder());
        System.out.println("After Decending order:"+numbers);

        //Iterater
        System.out.println(("Iterating with iterator: "));
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        Object[] array=numbers.toArray();
        System.out.println("Converted to Array: ");
        for(Object obj:array)
        {
            System.out.print(obj +" ");
        }
        System.out.println();
        numbers.clear();
        System.out.println("After Clearing the list: "+numbers);
        System.out.println("list is "+numbers.isEmpty());
    }
}

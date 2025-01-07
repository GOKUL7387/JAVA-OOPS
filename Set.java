import java.util.*;

public class SetProgram
{
    public static void main(String[] args)
    {

        //Add method
        Set<Integer> set1=new HashSet<Integer>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(70);
        System.out.print("Set1: ");
        System.out.println(set1);

        Set<Integer> set2=new HashSet<Integer>();
        set2.add(40);
        set2.add(50);
        set2.add(60);
        set2.add(10);
        System.out.print("Set2: ");
        System.out.println(set2);


        //Add All method
        System.out.println("Ater AddAll: ");
        set1.addAll(set2);
        System.out.println(set1);

        //Iterator method
        System.out.println("Using Iterator(): ");
        Iterator<Integer> iterator=set1.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        //Remove method
        set1.remove(30);
        System.out.println("After Removing 30: ");
        System.out.println(set1);

        //Remove All method 
        //Remove elements in set1 when the element present in set2...
        set1.removeAll(set2);
        System.out.println("After Remove All: ");
        System.out.println(set1);

        //Retain All method (Intersection)
        set1.add(50);
        set1.retainAll(set2);
        System.out.println("After Retain: ");
        System.out.println(set1);

        //Clear Method
        set1.clear();
        System.out.println("After Clear: ");
        System.out.println(set1);

        //Size method
        set1.add(10);
        set1.add(20);
        set1.add(30);
        System.out.println("The size of set1: "+set1.size());

        //To Array method
        Object[] arr=set1.toArray();
        System.out.println("Afetr changing to Array: ");
        for (Object obj : arr) 
        {
            System.out.print(obj+" ");
        }
        System.out.println();

        //Contains method
        System.out.println("Is the set Contains element 10: "+set1.contains(10));
    }
}

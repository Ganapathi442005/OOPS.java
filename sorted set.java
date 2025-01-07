import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;

import java.util.TreeSet;

public class setP {
    public static void main(String[] args) {
        SortedSet<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(5);
        set.add(15);
        set.add(30);
        System.out.println("Original set "+set);
        System.out.println("First element: "+set.first());
        System.out.println("Last Element: "+set.last());
        SortedSet<Integer> head=set.headSet(15);
        System.out.println("headset (less than 15): "+head);
        SortedSet<Integer> tail=set.tailSet(15);
        System.out.println("Taile Set (Element greater than or equal 15) : "+tail);
        SortedSet<Integer> subset=set.subSet(10,30);
        System.out.println("SubSet (10 to 30): "+subset);
        set.remove(20);
       System.out.println("After removing 20: " + set); // Output: [5, 10, 15, 25, 30]

        // Checking size and emptiness
        System.out.println("Size of set: " + set.size()); // Output: 5
        System.out.println("Is the set empty? " + set.isEmpty()); // Output: false

        // Checking containment
        System.out.println("Does the set contain 15? " + set.contains(15)); // Output: true

        // Converting to array
        Object[] array = set.toArray();
        System.out.println("Array from set: " + Arrays.toString(array)); // Output: [5, 10, 15, 25, 30]

        // Iterating over elements
        System.out.println("Iterating over set elements:");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); // Output: 5 10 15 25 30
        }
        System.out.println();

        // Clearing the set
        set.clear();
        System.out.println("Set after clearing: " + set); // Output: []

    }
}

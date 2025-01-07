import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        // 1. Vector Initialization
        Vector<Integer> vector = new Vector<>();

        // Add methods
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        System.out.println("Vector after adding elements: " + vector);

        vector.add(2, 25); // Insert at index 2
        System.out.println("Vector after inserting 25 at index 2: " + vector);

        vector.addAll(Arrays.asList(50, 60, 70)); // Append a collection
        System.out.println("Vector after adding collection: " + vector);

        vector.addAll(1, Arrays.asList(5, 15)); // Insert a collection at index 1
        System.out.println("Vector after inserting collection at index 1: " + vector);

        // Get and Set methods
        System.out.println("Element at index 3: " + vector.get(3));
        vector.set(3, 35); // Replace element at index 3
        System.out.println("Vector after setting 35 at index 3: " + vector);

        // Remove methods
        vector.remove(Integer.valueOf(25)); // Remove first occurrence of 25
        System.out.println("Vector after removing 25: " + vector);

        vector.remove(4); // Remove element at index 4
        System.out.println("Vector after removing element at index 4: " + vector);

        // Clear, contains, and isEmpty
        System.out.println("Vector contains 40: " + vector.contains(40));
        System.out.println("Is the vector empty? " + vector.isEmpty());

        // Size and Capacity
        System.out.println("Vector size: " + vector.size());
        System.out.println("Vector capacity: " + vector.capacity());

        // Enumeration and Iteration
        System.out.println("\nEnumeration of vector elements:");
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("\nIterator over vector elements:");
        Iterator<Integer> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nListIterator over vector elements:");
        ListIterator<Integer> listIterator = vector.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Searching and Sorting
        System.out.println("Index of 40: " + vector.indexOf(40));
        System.out.println("Last index of 40: " + vector.lastIndexOf(40));
        vector.sort(Comparator.naturalOrder());
        System.out.println("Vector after sorting: " + vector);

        // Capacity Management
        vector.ensureCapacity(20);
        System.out.println("Vector capacity after ensureCapacity(20): " + vector.capacity());

        vector.trimToSize();
        System.out.println("Vector capacity after trimToSize(): " + vector.capacity());

        vector.setSize(10);
        System.out.println("Vector after setting size to 10: " + vector);

        // Synchronization and Copy
        Vector<Integer> clonedVector = (Vector<Integer>) vector.clone();
        System.out.println("Cloned Vector: " + clonedVector);

        Integer[] array = vector.toArray(new Integer[0]);
        System.out.println("Array converted from Vector: " + Arrays.toString(array));

        // Clear all elements
        vector.clear();
        System.out.println("Vector after clearing: " + vector);
    }
}

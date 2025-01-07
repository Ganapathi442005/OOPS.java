import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetP {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();//set1
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println("Set is : "+set);
        System.out.println("Set size: "+set.size());
        System.out.println("Contains Apple? "+set.contains("Apple"));
        set.remove("Banana");
        System.out.println("Set after remove: "+set);
        set.addAll(Arrays.asList("papaya","mango"));
        System.out.println("Set after addALL():"+set);
        ArrayList<Integer> list = new ArrayList<>();//list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println("List is : "+list);
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(list); //set2
        System.out.println("Set2 elements are: "+set2);
        Object[] arr=set.toArray();
        System.out.println("Array: "+Arrays.toString(arr));
        set.clear();
        System.out.println("Is set empty? "+set.isEmpty());

        //retainAll()
        //containAll
        // removeAll()
    }
}

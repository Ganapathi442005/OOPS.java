import java.util.*;
public class set {
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
        set.add(12);
        set.add(24);
        set.add(36);
        System.out.println("the elements inside set: "+set);
        Set<Integer>set1=new HashSet<>();
        set1.add(12);
        set1.add(20);
        set1.add(32);
        System.out.println("the elements inside set1: "+set1);
        set.addAll(set1);
        System.out.println("the set after inserting set1 to it: "+set);
        Iterator iterator=set.iterator();
        System.out.println("the set after using iterator");
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        set.remove(32);
        System.out.println(set);
        System.out.println("the elements inside set1: "+set1);
        set1.retainAll(set);
        System.out.println("the set1 after retaining: "+set1);
        set.removeAll(set1);
        System.out.println("after removing all elements from set1: "+set);
        set1.clear();
        System.out.println("the set1 after clearing: "+set1);
        System.out.println("the set size is: "+set.size());
        System.out.println("to check the set contains the following element: "+set.contains(24));
        Object[] arr=set.toArray();
        System.out.println("set to array");
        for(Object obj:arr)
        {
        System.out.println(obj+" ");
        } 
        System.out.println("to check the elements prsent in set1 is present in set: "+set.containsAll(set1));


    }
}

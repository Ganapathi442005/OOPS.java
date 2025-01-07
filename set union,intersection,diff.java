import java.util.*;
public class setfunctions{
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in set 1 : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of elements in set 2 : ");
        int m = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element set1 : ");
            set1.add(sc.nextInt());
        }
        for(int i=0;i<m;i++)
        {
            System.out.print("Enter the element set2 : ");
            set2.add(sc.nextInt());
        }
        Set<Integer> cl = new HashSet<>(set1);
        Set<Integer> cl1 = new HashSet<>(set1);
        cl1.addAll(set2);
        System.out.println("The set1 contains set2 : "+set1.contains(set2));
        System.out.println("The Union of set1 and set2 is : "+cl1);
        cl.retainAll(set2);
        System.out.println("The Intersection of set1 and set2 is : "+cl);
        set1.removeAll(cl);
        set2.removeAll(cl);
        System.out.println("The set1 after subraction of two set is : "+set1);
        System.out.println("The set2 after subraction of two set is : "+set2);

    }
}

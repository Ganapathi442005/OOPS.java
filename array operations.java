import java.util.*;
 public class eagle{
  public static void main(String[] args) {
   List<Integer> l1=new ArrayList<>();
   l1.add(5);//adding
   l1.add(15);
   l1.add(25);
   l1.add(45);
   System.out.println("Initial List: " +l1);
   l1.add(3,35);
   System.out.println("List after adding index element: "+ l1);
   List<Integer> l2=List.of(1,11,12,13,15,18);//adding elements directly
   l1.addAll(l2);
   System.out.println("mixing two lists:"+l1);//copying a list into another list
   System.out.println("to get the number at index: "+l1.get(3));//getting required element
   l1.set(5,52);//altering element using index value
   System.out.println("After changing the element at index: "+l1);
   l1.remove(5);//removing an element
   System.out.println("After deleting the element at index: "+l1);
   l1.add(25);
   System.out.println("Adding  same element: "+l1);
   l1.remove(Integer.valueOf(25));//removing the 1st occurence of a value
   System.out.println("After removing the first occurence of element: "+l1);
   System.out.println(l2.isEmpty());//to check an array is empty
   System.out.println("to check l1 contains the given element: "+l1.contains(25));//to check an element is present or not
   System.out.println("to find the size of given aray: "+l1.size());//to find the size of an array
   System.out.println("to find the index of a number from last: "+l1.lastIndexOf(13));
   System.out.println("to find the index of a number from first: "+l1.indexOf(13));
   Collections.sort(l1);
   System.out.println("to sort an array: "+l1);
   l1.sort( Comparator.reverseOrder());
   System.out.println("to sort an array in reverse order: "+l1);
   Iterator<Integer> iterator=l1.iterator();
   while(iterator.hasNext()){
    System.out.println(iterator.next()+" ");
  Object[] arr=l1.toArray();
  System.out.println("Converted to Array: ");
  for(Object obj:arr){
    System.out.print(obj +" ");
   }
   System.out.println();
   l1.clear();
   System.out.println("After Clearing the list: "+l1);
   System.out.println("list is "+l1.isEmpty());
  }
}
}

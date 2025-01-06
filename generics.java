class main <T> {
     T name;
public T getname(){
  return name;
}
public void setname(T name){
    this. name=name;
}
}
 public class eagle{
  public static void main(String[] args) {
    main<Integer> l1=new main<>();
  l1.setname(87);
  System.out.println(l1.getname());
  main<String> l2=new main<>();
  l2.setname("nivas");
  System.out.println(l2.getname());
  }

}

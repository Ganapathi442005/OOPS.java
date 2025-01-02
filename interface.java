interface Animal{
    void sound();

}
interface  pet{
    void play();
}
class dog implements Animal,pet{
    public void sound(){
        System.out.println("dog barks.");
    }
    public void play()
    {
        System.out.println("dog plays.");
    }
}
public class interface1{
    public static void main(String args[])
    {
        dog d=new dog();
        d.play();
        d.sound();
    }
}

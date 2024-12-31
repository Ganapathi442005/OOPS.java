class Animal {
    void sound()
    {
        System.out.println("Animal makes sounds.");
    }
    
}
class dog extends Animal{
    @Override
    void sound()
    {
        System.out.println("Dogs barks");
    }
}
public class Overriding
{
    public static void main(String [] args)
    {
        Animal pp = new Animal();
        dog d = new dog();
        pp.sound();
        d.sound();
    }
}

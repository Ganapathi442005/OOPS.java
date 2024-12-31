class donald
{
    void play()
    {
        System.out.println("he is playing");
    }
}

class mukesh extends donald
{
   void code()
   {
    System.out.println("he is coding");
   }
}

class sundar extends mukesh
{
    void eat()
    {
        System.out.println("he is eating");
    }
}




public class singleinheritance {
    public static void main(String[] args) 
    {
    sundar b1=new sundar();
    b1.play();
    b1.code();
    b1.eat();
    }
}

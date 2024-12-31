class Adding{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public double add(double a,double b)
    {
        return a+b;
    }
}

///================================OVER LOADING===============================

public class polimorphism {
    public static void main(String [] args)
    {
        Adding a = new Adding();
        System.out.println("The sum of adding  two numbers is : "+a.add(12,42));
        System.out.println("The sum of adding  three numbers is : "+a.add(12,42,28));
        System.out.println("The sum of adding  two numbers is : "+a.add(12.09,42.93));
    }
}

public class display {
    public static void main(String[] args)
    {
        book book1=new book();
        book book2=new book();
        book1.title="java";
        book1.author="donald";
        book1.isAvailable=true;
        book2.title="python";
        book2.author="trumph";
        book2.isAvailable=true;
        book1.display();
        book2.display();
        book1.borrow();
        book1.display();
        book1.returned();
        book1.display();


    }
}

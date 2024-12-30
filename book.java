class book
{
     String title;
     String author;
     boolean isAvailable;
    public void display()
    {
      System.out.println("the name of the book is: " +title);
      System.out.println("the author of the book is: " +author);
      System.out.println("the book is available or not: " +((isAvailable)?"yes":"no"));
    }
    public void borrow()
    {
     if(isAvailable) 
     {
       isAvailable=false;
       System.out.println("the book "+title+ " borrowed"); 
     }  
    }
    public void returned()
    {
   
        isAvailable=true;
        System.out.println("the book "+title+ " returned");
    }

    } 

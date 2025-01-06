import java.io.*;
import java.util.*;

public class CreateFileExample {
    public static void main(String[] args) {
        try{
            File file = new File("example.text");
            if(file.delete())
            {
                System.out.println("The File is deleted : "+file.getName());
            }
            else{
                System.out.println("The File is failed to delete " );
            }   
        }
        catch(Exception e)
        {
            System.out.println("The File is Not found!!!!" );
        }
    }
}

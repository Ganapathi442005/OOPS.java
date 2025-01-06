import java.io.*;
import java.util.*;

public class CopyFileExample {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("source.text");
            FileOutputStream outputStream = new FileOutputStream("destination.text")){
            int data;
            while((data=inputStream.read())!=-1)
            {
                outputStream.write(data);
            }
            System.out.println("File copied successfully");
        }
        catch(IOException e)
        {
            System.out.println("Error Occured in the Copying!!");
        }
    }
}

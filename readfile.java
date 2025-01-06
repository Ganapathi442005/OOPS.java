import java.io.*;
import java.util.*;

public class CreateFileExample {
    public static void main(String[] args) {
        try{
            File file = new File("example.text");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("The file is not found!!!");
        }
    }
}

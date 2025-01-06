import java.io.File;
import java.io.FileWriter;

public class CreateFileExample {
    public static void main(String[] args) {
        try{
            File file = new File("example");
            if(file.createNewFile()){
                System.out.println("File Created : "+file.getName());
                FileWriter writer = new FileWriter(file);
                writer.write("The Java is a oops language");
                writer.close();
                System.out.println("The message is added to the file!!!");
            }
            else{
                System.out.println("File already Exist");
            }
        }
        catch(Exception e)
        {
            System.out.println("The file Occured an error!!!");
        }
    }
}

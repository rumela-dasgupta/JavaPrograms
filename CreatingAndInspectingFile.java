// file handling 1:  Creating and Inspecting a File
import java.io.*;
//import java.util.*;
public class CreatingAndInspectingFile{
    public static void main(String[] args) throws IOException{
        File file=new File("example3.txt"); //create file object(path to file)
        if (file.createNewFile()){ // creating the file in the system
            System.out.println("File created " + file.getName());

        }else{
            System.out.println("File already exists");
        }
        System.out.println("Absolute path: "+file.getAbsolutePath());
        System.out.println("Can read: "+file.canRead());
        System.out.println("Can write: "+file.canWrite());
        System.out.println("File Size: "+file.length()+" bytes");
        file.delete();
        System.out.println("File deleted");
    }

}

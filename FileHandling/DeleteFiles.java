package FileHandling;
import java.io.File;


public class DeleteFiles {
    public static void main(String[] args) {
        File myObj = new File("H:\\Learning\\Programming\\Java\\FileHandling\\TRYfilename.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("An error occurred.");
        }
    }    
}

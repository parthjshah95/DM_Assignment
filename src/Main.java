import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by Xorcist on 09-04-2017.
 */
public class Main {
    public static void main(String[] args){
        FileReader in = null;
        FileWriter out = null;

        try{
            File file = new File("resources/vote.arff");
            //System.out.println(file.exists());
            in = new FileReader(file);
        }catch (FileNotFoundException e){
            System.out.println("file not found");
        }
        System.out.println(in.getClass());
    }
}

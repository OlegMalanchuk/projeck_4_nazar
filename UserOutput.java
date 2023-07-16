import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class UserOutput {
    public static void outputUserFromFile(){
        try {
            List<String> allLines = Files.readAllLines(Paths.get("newFile.txt"));
            System.out.println("Info all users\n{ ");
            for (String line : allLines) {

                System.out.println("[ "+line+" ]");
            }
            System.out.println("}");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

import file.UserOutput;

import java.io.*;
import java.util.Scanner;


public class FileProcess {

    public static void gg() throws IOException {
        File inputFile = new File("newFile.txt");
        File tempFile = new File("FileTest.txt");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;
        Scanner dd = new Scanner(System.in);
        System.out.println(" =");
        String f = dd.nextLine();
        while ((currentLine = reader.readLine()) != null) {
            if (null != currentLine && !currentLine.equalsIgnoreCase(f)) {
                writer.write(currentLine + System.getProperty("line.separator"));
            }
        }
        writer.close();
        reader.close();
        dd.close();

        boolean successful = inputFile.renameTo(tempFile);
        System.out.println(successful);
        UserOutput.outputUserFromFile();

    }


}

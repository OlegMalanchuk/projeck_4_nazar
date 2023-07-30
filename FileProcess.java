import file.UserOutput;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;


public class FileProcess {

    public static void gg() throws IOException {
        File inputFile = new File("newFile.txt");
        File tempFile = new File("FileTest.txt");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;
        Scanner dd = new Scanner(System.in);
        System.out.print(" =");
        String f = dd.nextLine();
        while ((currentLine = reader.readLine()) != null) {
            if (null != currentLine && !currentLine.equalsIgnoreCase(f)) {
                writer.write(currentLine + System.getProperty("line.separator"));
            }
        }
        writer.close();
        reader.close();


//        boolean successful = inputFile.renameTo(tempFile);
        Path inputPath = inputFile.toPath();
        Path tempPath = tempFile.toPath();
        // Використовуємо метод Files.move() для переміщення тимчасового файлу до вхідного файлу
        // Якщо файл з таким ім'ям вже існує, ми замінюємо його
        Files.move(tempPath, inputPath, StandardCopyOption.REPLACE_EXISTING);

        boolean successful = true;
        System.out.println(successful);
        UserOutput.outputUserFromFile();

    }


}

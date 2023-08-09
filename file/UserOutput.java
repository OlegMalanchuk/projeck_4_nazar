package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class UserOutput {
    public static void outputUserFromFile(){
        try {
            List<String> allLines = Files.readAllLines(Paths.get("newFile.txt"));
            System.out.println("Всі користувачі\n{ ");
            for (String line : allLines) {
                System.out.println("[ "+line+" ]");
            }
            System.out.println("}");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void outAllUser(){
        System.out.println("Ця інформація доступна тільки зареєстрованим користувачам\nТи зареєстрований ?\n1 = так 2 = ні");
        Scanner scam2 = new Scanner(System.in);
        int i2 = scam2.nextInt();
        if (i2 == 1) {
            System.out.print("підтвердіть користувача (нік) :");
            Scanner scannerNik = new Scanner(System.in);
            String nik = scannerNik.nextLine();
            try (FileReader fileReader = new FileReader("newFile.txt");// це FileReader він знаходить шлях
                 //до файлу з інформацією і дозволяє
                 BufferedReader reader = new BufferedReader(fileReader)) {// вже BufferedReader читати самі стрічки із заданого файлу в ()
                String currentLine;// змінна якій кожного разу буде присвоювалося значення з файлу
                // перша стрічка ->currentLine ; друга стрічка ->currentLine;...  так далі
                int f = 0;
                while ((currentLine = reader.readLine()) != null) {//цикл йде доти поки не завершаться рядки з інфою в документі
                    if (currentLine.equals(nik)) //тут ми порівнюємо інфу в документі та з веденої у консоль
                    {
                        System.out.println("вдало підтвердили користувача!!");// виведе коли користувач існує
                        UserOutput.outputUserFromFile();
                        f++;
                        break;// ліваємо з циклу
                    }
                }
                if (f == 0){
                    System.err.println("перейдіть на перший пункт та зареєструйтеся ");
                }
            } catch (IOException ex) {
                System.err.println(ex);
            }
        } else {System.err.println("перейдіть на перший пункт та зареєструйтеся ");
        }// я не єбу як воно працює але то сука правильно
    }

    public static void ensUser (String inform) {
        boolean found = false;                                                  // ця змінна відповідає за особу користувача вона фолс тому, що ми не можемо знати чи користувач є у списку
                                                                                // і її логіка полягає в тому, що б ми могли записати невідомого списку користувача

        try (
                FileReader fileReader = new FileReader("newFile.txt");  // це FileReader він знаходить шлях
                                                                                //до файлу з інформацією і дозволяє
                BufferedReader reader = new BufferedReader(fileReader)) {       // вже BufferedReader читати самі стрічки із заданого файлу в ()
            String currentLine;                                                 // змінна якій кожного разу буде присвоювалося значення з файлу
                                                                                // перша стрічка ->currentLine ; друга стрічка ->currentLine;...  так далі
            while ((currentLine = reader.readLine()) != null) {                 //цикл йде доти поки не завершаться рядки з інфою в документі
                if (currentLine.equalsIgnoreCase(inform))                       //тут ми порівнюємо інфу в документі та з веденої у консоль
                {
                    System.err.println("користувач існує \n");                  // виведе коли користувач існує
                    found = true;                                               // зробимо found трушним що б не записати цього користувача повторно
                    break;                                                      // ліваємо з циклу
                }
            }
        } catch (
                IOException ex) {
            System.err.println(ex);
        }
        if (!found) {                                                            // якщо користувача нема ми через те що стоїть ! фолс == тру і через це ми записуємо користувача
                                                                                 // але якщо found став тру тоді не записуємо, бо тру стане фолс і не виконається умова
            CrieterOrWritingFile.addNewUser(inform);                                      //...
        }
    }


}

package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Register {
    public static void tt (String inform) {
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
                    System.err.println("користувач існує \n");                     // виведе коли користувач існує
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
            WritingFile.addNewUser(inform);                                      //...
        }
    }
}

package file;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {

    public static void addNewUser(String newUser){
        try (FileWriter writer = new FileWriter("newFile.txt", true))
        {// імпорт класу , шлях , та тру що б інфа зберігалася
            writer.write(newUser);//метод для запису
            writer.append("");// додаєм пропуск і бблять нівякому разу не + :%;;:%?№?%:8 о таку поєботу бо джава буде
            // додавала це до користувача і він завжди буде новий
            // по типи ти ввів олег --> джавав записала як олег;
            // і ти знов ввів олег а джава не написала що такий користувач існує і додала його знов
            writer.append("\n");//новий рядок
            writer.flush();// записуємо це все і закриваємо
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println("користувача додано");
    }
}

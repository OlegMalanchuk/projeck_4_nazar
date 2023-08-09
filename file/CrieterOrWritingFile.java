package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrieterOrWritingFile {

        public static void fileCreator(){
            try {// функція \яка виконається до помилки
                File file = new File("newFile.txt");// ініціалізація класу для створення файлу та шлях файлу

                if (file.createNewFile()){// саме створення
                    System.out.println("файл створений ");
                }else{//якщо створений виведе це
                    System.out.println("файл створений раніше ");
                }
            }catch (Exception e ){// ловимо помилку
                System.err.println(e);
            }
        }
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


package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AutNewUser{
    public static void checkRegistration() throws FileNotFoundException, IOException {
        System.out.println("Ця інформація доступна тільки зареєстрованим користувачам\nТи зареєстрований ?\n1 = так 2 = ні");
        Scanner choice = new Scanner(System.in);
        int i = choice.nextInt();
        if(i == 1)
        {
            Scanner scannerNik = new Scanner(System.in);
            int f = 0;
            System.out.println("підтвердіть користувача (нік) :");
            String nik = scannerNik.nextLine();
            System.out.println(" ");

            try (FileReader fileReader = new FileReader("newFile.txt"); BufferedReader reader = new BufferedReader(fileReader))
            {
                String currentLine;

                while ((currentLine = reader.readLine()) != null)
                {
                    if (currentLine.equalsIgnoreCase(nik))
                    {
                        System.out.println("вдало підтвердили користувача!!\n"+"іформвція про користувача: " + nik);
                        f ++;break;
                    }
                }
//                if (f ==0){
//                    System.err.println("перейдіть на перший пункт та зареєструйтеся  ");
//                }
            }
        }
        else if(i==2)
        {
            System.err.println("перейдіть на перший пункт та зареєструйтеся ");
        }
    }

























//    System.out.println("Ця інформація доступна тільки зареєстрованим користувачам\nТи зареєстрований ?\n1 = так 2 = ні");
//    Scanner scam3 = new Scanner(System.in);
//    int i3 = scam3.nextInt();
//    if(i3 ==1) {
//        System.out.print("підтвердіть користувача (нік) :");
//        Scanner scannerNik = new Scanner(System.in);
//        String nik = scannerNik.nextLine();
//        try (FileReader fileReader = new FileReader("newFile.txt");// це FileReader він знаходить шлях
//             //до файлу з інформацією і дозволяє
//             BufferedReader reader = new BufferedReader(fileReader)) {// вже BufferedReader читати самі стрічки із заданого файлу в ()
//            String currentLine;// змінна якій кожного разу буде присвоювалося значення з файлу
//            // перша стрічка ->currentLine ; друга стрічка ->currentLine;...  так далі
//            while ((currentLine = reader.readLine()) != null) {//цикл йде доти поки не завершаться рядки з інфою в документі
//                if (currentLine.equalsIgnoreCase(nik)) //тут ми порівнюємо інфу в документі та з веденої у консоль
//                {
//                    System.out.println("вдало підтвердили користувача!!");// виведе коли користувач існує
//                    System.out.println("іформвція про користувача " + nik);
//                    // ліваємо з циклу
//                }
//            }
//            break;
//        } catch (IOException ex) {
//            System.err.println(ex);
//        }
//    } else
//
//    {
//        System.out.println("перейдіть на перший пункт та зареєструйтеся ");
//    }// я не єбу як воно працює але то сука правильно
//}


}

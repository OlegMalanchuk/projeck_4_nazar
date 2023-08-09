import file.*;

import java.io.*;
import java.util.Scanner;

public class Main
{
    public static <BodyContentHandler> void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in); // це сканер )

        while (true) {
            Helpers.outMenu();
            System.out.println("виберіть якийсь пункт:");
            int choiceMenu = sc.nextInt();
            switch (choiceMenu) {
//***********************************************************************************************************************************
                case 1:
                    CrieterOrWritingFile.fileCreator();// ...
                    Scanner scanner = new Scanner(System.in);// сканер
                    System.out.print("Зареєструйте користувача імя прізвище:");
                    String informPerson = scanner.nextLine();// присвоюємо до змінної введену інфу з консолі
                    UserOutput.ensUser(informPerson);

                    break;
//***********************************************************************************************************************************
                case 2:
                    UserOutput.outAllUser();
                    break;
//***********************************************************************************************************************************
                case 3:
                    AutNewUser.checkRegistration();
                    break;
//***********************************************************************************************************************************
                case 4:
                    System.out.println("Ця інформація доступна тільки зареєстрованим користувачам\nТи зареєстрований ?\n1 = так 2 = ні");
                    Scanner scam4 = new Scanner(System.in);
                    int i4 = scam4.nextInt();
                    if (i4 == 1) {
                        System.out.print("підтвердіть користувача (нік) :");
                        Scanner scannerNik = new Scanner(System.in);
                        String nik = scannerNik.nextLine();
                        try (FileReader fileReader = new FileReader("newFile.txt");// це FileReader він знаходить шлях
                             //до файлу з інформацією і дозволяє
                             BufferedReader reader = new BufferedReader(fileReader)) {// вже BufferedReader читати самі стрічки із заданого файлу в ()
                            String currentLine;// змінна якій кожного разу буде присвоювалося значення з файлу
                            // перша стрічка ->currentLine ; друга стрічка ->currentLine;...  так далі
                            while ((currentLine = reader.readLine()) != null) {//цикл йде доти поки не завершаться рядки з інфою в документі
                                if (currentLine.equalsIgnoreCase(nik)) //тут ми порівнюємо інфу в документі та з веденої у консоль
                                {
                                    fileReader.close();
                                    System.out.println("вдало підтвердили користувача!!");// виведе коли користувач існує
                                    FileProcess.gg();
                                    FileReader fileReader1 = new FileReader("newFile.txt");

                                }
                            }
                            break;
                        } catch (IOException ex) {
                            System.err.println(ex);
                        }
                    } else {
                        System.out.println("перейдіть на перший пункт та зареєструйтеся ");
                    }// я не єбу як воно працює але то сука правильно

                    break;


//***********************************************************************************************************************************
                case 5:
                    RandomString.generateRandomString();
                    break;
//***********************************************************************************************************************************
                case 6:
                    System.out.println("exit");
                    System.exit(1);
                    break;
                default:
                    System.out.println("невірний вибір !!!");
            }
        }
    }
}

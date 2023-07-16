import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static <BodyContentHandler> void main(String[] args)
    {


        Scanner sc = new Scanner(System.in); // це сканер )

            while (true ){

            Helpers.outMenu();

            System.out.print("write here choice :");
            int choiceMmenu = sc.nextInt();
            System.out.println(" ");

            switch (choiceMmenu) {
                case 1:
                    CrieterFile.fileCreator();// ...

                    Scanner scanner = new Scanner(System.in);// сканер
                    System.out.print("Зареєструйте користувача імя прізвище : ");
                    String informPerson = scanner.nextLine();// присвоюємо до змінної введену інфу з консолі

                    boolean found  = false;// ця змінна відповідає за особу користувача вона фолс тому, що ми не можемо знати чи користувач є у списку
                    // і її логіка полягає в тому, що б ми могли записати невідомого списку користувача

                    try (FileReader fileReader = new FileReader("newFile.txt");// це FileReader він знаходить шлях
                         //до файлу з інформацією і дозволяє
                         BufferedReader reader = new BufferedReader(fileReader)) {// вже BufferedReader читати самі стрічки із заданого файлу в ()
                        String currentLine;// змінна якій кожного разу буде присвоювалося значення з файлу
                        // перша стрічка ->currentLine ; друга стрічка ->currentLine;...  так далі
                        while ((currentLine = reader.readLine()) != null) {//цикл йде доти поки не завершаться рядки з інфою в документі
                            if (currentLine.equalsIgnoreCase(informPerson)) //тут ми порівнюємо інфу в документі та з веденої у консоль
                            {
                                System.err.println("користувач існує");// виведе коли користувач існує
                                found = true;// зробимо found трушним що б не записати цього користувача повторно
                                break;// ліваємо з циклу
                            }
                        }
                    } catch (IOException ex) {
                        System.err.println(ex);
                    }
                    if (!found) { // якщо користувача нема ми через те що стоїть ! фолс == тру і через це ми записуємо користувача
                        // але якщо found став тру тоді не записуємо, бо тру стане фолс і не виконається умова
                        WritingFile.addNewUser(informPerson);//...
                    }
                    break;
                case 2:
                   UserOutput.outputUserFromFile();
                    break;
                case 3:
                    System.out.println("dd");
                    break;
                case 4:
                    System.out.println("kk");
                    System.out.println("kk");
                    System.out.println("kk");
                    System.out.println("kk");
                    break;
                case 5:
                    Helpers.randomGeneratorText();
                    break;

                case 6:
                    System.out.println("exit");
                    System.exit(1);
                    break;
                default:
                    System.out.println("not correct writing");
            }

            }






















    }
}

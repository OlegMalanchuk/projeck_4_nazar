package file;

import java.io.File;

public class CrieterFile {

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
    }


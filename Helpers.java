import file.WritingFile;

import java.util.Random;
import java.util.Scanner;

public  class Helpers
{
    public static void outMenu(){
        System.out.println("________________________________________________________________");
        System.out.println("1 - зарегеструйти свій акаунт, якщо ви тут в перше;");
        System.out.println("2 - вивести інформацію про всіх користувачів які зареєстровані;");
        System.out.println("3 - подивитись власну інформацію;");
        System.out.println("4 - видалити всю інформацію про себе;");
        System.out.println("5 - вивести рандомно згенерований текст;");
        System.out.println("6 - закінчити програму;");
        System.out.println("________________________________________________________________");
    }

    public static String registerNewUser(String nik){
        String newNameUser = nik;
        return newNameUser;

    }



}

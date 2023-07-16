import java.util.Random;

public  class Helpers
{
    public static void outMenu(){
        System.out.println(" ");
        System.out.println("1 - зарегеструйти свій акаунт, якщо ви тут в перше;");
        System.out.println("2 - вивести інформацію про всіх користувачів які зареєстровані;");
        System.out.println("3 - подивитись власну інформацію;");
        System.out.println("4 - видалити всю інформацію про себе;");
        System.out.println("5 - вивести рандомно згенерований текст;");
        System.out.println("6 - закінчити програму;");
        System.out.println(" ");
    }

    public static void randomGeneratorText()
    {
        String[] array = new String[]{"oleg ","nazar ","ddd ","dd ","fff ","gggg ","hhhhh ","nnnnn ","mmmmm ","z ","zz ","xxx ","xx ","t ","y "};
        Random random = new Random();
        for (int i = 0; i<20;i++){
            int index = random.nextInt(array.length);
            System.out.print(array[index]);
        }
        System.out.println(" ");
    }




}

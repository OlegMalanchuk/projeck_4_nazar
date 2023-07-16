import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {


        Scanner sc = new Scanner(System.in); // це сканер )

            while (true ){

            Helpers.outMenu();

            System.out.print("write here choice :");
            int choiceMmenu = sc.nextInt();
            System.out.println(" ");

            switch (choiceMmenu) {
                case 1:
                    System.out.println("kk");
                    break;
                case 2:
                    System.out.println("kk");
                    System.out.println("kk");
                    break;
                case 3:
                   Helpers.randomGeneratorText();
                    break;
                case 4:
                    System.out.println("kk");
                    System.out.println("kk");
                    System.out.println("kk");
                    System.out.println("kk");
                    break;
                case 5:
                    System.out.println("exit");
                    System.exit(1);
                    break;
                default:
                    System.out.println("not correct writing");
            }

            }






















    }
}

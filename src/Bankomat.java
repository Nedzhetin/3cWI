import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();


        boolean isFinished = false;
        int kontostand = 0;





        while (!isFinished){
            System.out.println("1.Einzahlen");
            System.out.println("2.Abheben");
            System.out.println("3.Kontostand");
            System.out.println("4.Beenden");

            if (selection == 1){
                System.out.println("ahaa");
            }
        }
    }
}

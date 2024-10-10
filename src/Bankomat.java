import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isFinished = false;
        int kontostand = 0;



        while (!isFinished){
            System.out.println("1.Einzahlen");
            System.out.println("2.Abheben");
            System.out.println("3.Kontostand");
            System.out.println("4.Beenden");
            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("Wie viel Geld möchten Sie einzahlen?");

                if (scanner.hasNextInt()) {
                    int einzahlen = scanner.nextInt();
                 if (einzahlen > 0){
                     kontostand = kontostand + einzahlen;
                 }
                 else{
                     System.out.println("Keine positive Zahl");
                 }
                } else {
                    System.out.println("Die Eingabe ist ungültig");
                    scanner.next(); // Clear the invalid input
                }
            }
            if (selection == 2){
                System.out.println("Wie viel Geld möchten Sie Abhe  ben?");

                if (scanner.hasNextInt()){
                    int  abheben = scanner.nextInt();
                    kontostand = kontostand  - abheben;
                }else {
                    System.out.println("Die Eingabe ist ungültig");
                    scanner.next(); // Clear the        invalid input
                }

            }
            if (selection == 3){
                System.out.println(kontostand);
            }

            if (selection == 4){
                isFinished = true;
            }

        }
    }
}

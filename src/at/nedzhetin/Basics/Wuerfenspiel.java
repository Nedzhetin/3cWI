import java.util.Random;
import java.util.Scanner;

public class Wuerfenspiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean isFinished = false;
        int rounds = 6;
        int playerOne = 0;
        int playerTwo = 0;


        while (!isFinished){
            System.out.println("Du darfst noch " + rounds + " mal würfeln.");
            System.out.println("1.Würfeln");
            System.out.println("2.Spiel beenden");
            int selection = scanner.nextInt();

            if (selection == 1){
                int randomNum1 = random.nextInt(6)+1;
                int randomNum2 = random.nextInt(6)+1;

                playerOne += randomNum1;
                playerTwo += randomNum2;

               rounds -= 1;


                System.out.println("\nSpieler 1 hat " + randomNum1 + " gewürfelt");
                System.out.println("Spieler 2 hat " + randomNum2 + " gewürfelt\n");

              if (rounds == 0){
                  System.out.println("Spieler 1: " + playerOne);
                  System.out.println("Spieler 2: " + playerTwo);

                  if (playerOne > playerTwo){
                      System.out.println(" Spieler 1 hat gewonnen!");
                  }else if (playerOne == playerTwo){
                      System.out.println("Unentschieden");
                  } else {
                      System.out.println("Spieler 2 hat gewonnen!");
                  }
                  isFinished =true;
              }

            }

            if (selection == 2){
                isFinished = true;
            }
        }
    }
}

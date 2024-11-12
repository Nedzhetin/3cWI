package at.nedzhetin.OO_Programming.miniGame;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isFinished = false;
        Character playerOne = null;
        Character playerTwo = null;
        SpecialAbility fireBall = new FireAbility();
        int selection;


        Character jjChico = new Character("JJChico", 18, "male", "He is cool", "fire", 100, fireBall);
        Character subzero = new Character("Subzero", 25, "male", "he is cold", "ice", 100, fireBall);


        while (!isFinished) {

            if (playerOne == null) {
                System.out.println("Player1 Choose your Character:");
                System.out.println("1: ");
                jjChico.display();
                System.out.println("2: ");
                subzero.display();

                selection = sc.nextInt();

                switch (selection) {
                    case 1:
                        playerOne = jjChico;
                        break;
                    case 2:
                        playerOne = subzero;
                        break;
                    default:
                        System.out.println("Invalid selection. Please choose 1 or 2.");
                        continue;
                }
            } else if (playerTwo == null) {
                System.out.println("Player2 Choose your Character:");
                selection = sc.nextInt();
                switch (selection) {
                    case 1:
                        playerTwo = jjChico;
                        break;
                    case 2:
                        playerTwo = subzero;
                        break;
                    default:
                        System.out.print("Invalid selection. Please choose 1 or 2.");
                        continue;
                }

                if (playerOne != null && playerTwo != null) {
                    playerOne.displayHp();
                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                    playerTwo.displayHp();
                }

            }
        }
    }



}


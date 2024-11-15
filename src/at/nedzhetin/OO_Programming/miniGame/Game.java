package at.nedzhetin.OO_Programming.miniGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Scanner sc = new Scanner(System.in);
    private boolean isFinished = false;
    private Character playerOne = null;
    private Character playerTwo = null;
    private Character currentPlayer;
    private Character opponentPlayer;
    public int rounds = 0;
    private int selection;
    List<Character> characters = new ArrayList<Character>();
    List<Weapon> weapons = new ArrayList<Weapon>();


    public void runGame() {

        Weapon defaultWeapon = new Weapon("default Weapon", 0, "none");

         SpecialAbility fireBall = new OffensiveAbility("Fire Ball","12 Damage",12);
         SpecialAbility iceWall = new DefensiveAbility("Ice Wall","immune for the next 2 rounds");

        Character fireMan = new Character("FireMan", 18, "male", "He is cool", "fire", 100, fireBall, defaultWeapon);
        Character iceMan = new Character("IceMan", 25, "male", "he is cold", "ice", 100, iceWall, defaultWeapon);
        Character thunderMage = new Character("ThunderMage", 84, "female", "Wields the power of storms, agile but fragile", "lightning", 100, fireBall, defaultWeapon);


        Weapon fireAxe = new Weapon("fire Axe", 8, "fire");
        Weapon iceSword = new Weapon("ice Sword", 5, "ice");

        characters.add(fireMan);
        characters.add(iceMan);
        weapons.add(fireAxe);
        weapons.add(iceSword);


        while (!isFinished) {


            if (playerOne == null) {
                System.out.println("Player1 Choose your Character:");
                System.out.println("1: ");
                fireMan.display();
                System.out.println("2: ");
                iceMan.display();
                selection = sc.nextInt();


                if (selection -1 < 0 || selection -1 >= characters.size()) {
                    System.out.println("Invalid selection. Please choose 1 or 2.");
                }else{
                    playerOne = characters.get(selection - 1);
                }

                System.out.println("Player1 Choose your Weapon:");
                System.out.println("1: ");
                fireAxe.display();
                System.out.println("2: ");
                iceSword.display();

                selection = sc.nextInt();


                switch (selection) {
                    case 1:
                        playerOne.setWeapon(weapons.get(0));
                        break;
                    case 2:
                        playerOne.setWeapon(weapons.get(1));
                        break;
                    default:
                        System.out.println("Invalid selection. Please choose 1 or 2.");

                }


            } else if (playerTwo == null) {
                System.out.println("Player2 Choose your Character:");
                selection = sc.nextInt();


                if (selection -1 < 0 || selection -1 >= characters.size()) {
                    System.out.println("Invalid selection. Please choose 1 or 2.");
                }else{
                    playerTwo = characters.get(selection - 1);
                }


                        System.out.println("Player2 Choose your Weapon:");
                        System.out.println("1: ");
                        fireAxe.display();
                        System.out.println("2: ");
                        iceSword.display();

                        selection = sc.nextInt();


                        switch (selection) {
                            case 1:
                                playerTwo.setWeapon(weapons.get(0));
                                break;
                            case 2:
                                playerTwo.setWeapon(weapons.get(1));
                                break;
                            default:
                                System.out.println("Invalid selection. Please choose 1 or 2.");

                        }





                while (playerOne != null || playerTwo != null) {

                    if (rounds == 0) {

                        this.currentPlayer = this.playerOne;
                        this.opponentPlayer = this.playerTwo;
                    }

                    System.out.println("\n\n\n");
                    playerOne.displayHp();
                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                    playerTwo.displayHp();
                    System.out.println("\n\n");
                    if (currentPlayer == playerOne) {
                        if (rounds == 0){
                            playerOne.weapon.buffWeapon(playerOne);
                        }
                        System.out.println("PLAYER 1:\n");
                        System.out.println("1." + playerOne.ability.getAbilityName() + "(" + playerOne.ability.getInfo() + ")");
                        System.out.println("2." + playerOne.weapon.getName() + "(" + playerOne.weapon.getDamage() +" Damage) " + playerOne.weapon.displayBuffs(playerOne)+"% Buff included");
                        System.out.println("3.heal");

                    } else {
                        if (rounds == 1){
                            playerTwo.weapon.buffWeapon(playerTwo);
                        }
                        System.out.println("PLAYER 2:\n");
                        System.out.println("1." + playerTwo.ability.getAbilityName() + "(" + playerTwo.ability.getInfo() + ")");
                        System.out.println("2." + playerTwo.weapon.getName() + "(" + playerTwo.weapon.getDamage() +" Damage) " + playerTwo.weapon.displayBuffs(playerTwo)+"% Buff included");
                        System.out.println("3.heal");

                    }


                    selection = sc.nextInt();
                    if (selection == 1) {
                        currentPlayer.ability.useAbility(opponentPlayer);
                    }
                    if(selection == 2) {
                        currentPlayer.weapon.useWeapon(opponentPlayer);
                    }
                    if (selection == 3) {
                        currentPlayer.heal();
                    }
                    rounds++;
                    System.out.println(rounds + " rounds");

                    if (this.currentPlayer == this.playerOne) {
                        this.currentPlayer = this.playerTwo;
                        this.opponentPlayer = this.playerOne;
                    } else if (this.currentPlayer == this.playerTwo) {
                        this.currentPlayer = this.playerOne;
                        this.opponentPlayer = this.playerTwo;
                    }
                }

            }
        }
    }

}

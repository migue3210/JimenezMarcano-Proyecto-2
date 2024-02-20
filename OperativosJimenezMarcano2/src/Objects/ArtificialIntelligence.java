/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import operativosjimenezmarcano2.Main;

/**
 *
 * @author cdmar
 */
public class ArtificialIntelligence extends Thread {

    private Admin admin;
    private Simulation simulation;

    public ArtificialIntelligence(Simulation simulation) {
        this.admin = simulation.getAdmin();
        this.simulation = simulation;

    }
    int avatarVictory = 0;
    int regularShowVictory = 0;

    public void performBattle(StudioCharacter character1, StudioCharacter character2) {

        Random random = new Random();
        int randomNumber = random.nextInt(101);
        int desition = randomNumber; //The int desition will be a random number between 0 and 100 representing percentages
        try {
            sleep(simulation.getBattleDuration()); //Sleeps for the battle duration
        } catch (InterruptedException ex) {
            Logger.getLogger(ArtificialIntelligence.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (0 <= desition && desition <= 40) { //40% chance of existing a winner
            /*
                The characters will battle to find a winner
                To determine the winner, the fastest (higher agility) character will hit first, 
                then they will alternate between hitting each other by turns until one reaches negative or 0 healthPoints
             */
            System.out.println("----THE FIGHT BETWEEN " + character1.getId() + " AND " + character2.getId() + " BEGINS----");
            if (character1.getAgilityPoints() > character2.getAgilityPoints()) { //Scenario where character1 is faster than character2

                while (true) { //They hit each other until one of them dies :-D
                    //Character 1 hits first
                    character2.setHealthPoints(character2.getHealthPoints() - character1.getStrengthPoints());
                    System.out.println("The character " + character1.getId() + " hits " + character2.getId() + " for " + character1.getStrengthPoints() + " damage");
                    System.out.println(character2.getId() + "has " + character2.getHealthPoints() + "hp remaining!");
                    if (character2.getHealthPoints() <= 0) { //Checks if character2 Dies

                        System.out.println("The character " + character2.getId() + "DIED, " + character1.getId() + " wins");
                        admin.winnerEscenario(character1, character2); //Sends admin the info with character1 as winner and character2 as loser
                        regularShowVictory++;
                        Main.battleInterface.getRegularShowVictories().setText(String.valueOf(regularShowVictory));
                        break;
                    }
                    character1.setHealthPoints(character1.getHealthPoints() - character2.getStrengthPoints());
                    System.out.println("The character " + character2.getId() + " hits " + character1.getId() + " for " + character2.getStrengthPoints() + " damage");
                    System.out.println(character1.getId() + "has " + character1.getHealthPoints() + "hp remaining!");
                    if (character1.getHealthPoints() <= 0) { //Checks if character1 Dies

                        System.out.println("The character " + character1.getId() + "DIED, " + character2.getId() + " wins");
                        admin.winnerEscenario(character2, character1); //Sends admin the info with character2 as winner and character1 as loser
                        avatarVictory++;
                        Main.battleInterface.getAvatarVictories().setText(String.valueOf(avatarVictory));
                        break;
                    }

                }
            } else { //Scenario where character2 is faster than character1
                while (true) { //They hit each other until one of them dies :-D
                    //Character 2 hits first
                    character1.setHealthPoints(character1.getHealthPoints() - character2.getStrengthPoints());
                    System.out.println("The character " + character2.getId() + " hits " + character1.getId() + " for " + character2.getStrengthPoints() + " damage");
                    System.out.println(character1.getId() + "has " + character1.getHealthPoints() + "hp remaining!");

                    if (character1.getHealthPoints() <= 0) { //Checks if character1 Dies

                        System.out.println("The character " + character1.getId() + "DIED, " + character2.getId() + " wins");
                        admin.winnerEscenario(character2, character1); //Sends admin the info with character2 as winner and character1 as loser
                        avatarVictory++;
                        Main.battleInterface.getAvatarVictories().setText(String.valueOf(avatarVictory));
                        break;
                    }

                    character2.setHealthPoints(character2.getHealthPoints() - character1.getStrengthPoints());
                    System.out.println("The character " + character1.getId() + " hits " + character2.getId() + " for " + character1.getStrengthPoints() + " damage");
                    System.out.println(character2.getId() + "has " + character2.getHealthPoints() + "hp remaining!");
                    if (character2.getHealthPoints() <= 0) { //Checks if character2 Dies

                        System.out.println("The character " + character2.getId() + "DIED, " + character1.getId() + " wins");
                        admin.winnerEscenario(character1, character2); //Sends admin the info with character1 as winner and character2 as loser
                        regularShowVictory++;
                        Main.battleInterface.getRegularShowVictories().setText(String.valueOf(regularShowVictory));
                        break;
                    }

                }
            }
        }

        if (40 < desition && desition <= 67) {  // 27% chance of a tie
            System.out.println("----THE FIGHT BETWEEN " + character1.getId() + " AND " + character2.getId() + " ENDED IN A TIE----");
            admin.tieEscenario(character1, character2);
        }
        if (67 < desition && desition <= 100) {
            System.out.println("----THE FIGHT BETWEEN " + character1.getId() + " AND " + character2.getId() + " WAS CANCELLED, THEY WERE NOT READY FOR BATTLE----");
            admin.canceledCombatEscenario(character1, character2);
        }

    }
}

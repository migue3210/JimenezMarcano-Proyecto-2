/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operativosjimenezmarcano2;

import Interface.BattleInterface;
import Objects.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Miguel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static Simulation simulation = new Simulation("CN", "NK", 10000);

    public static Studio cartoonNetwork = simulation.getStudio1();
    public static Studio nickelodeon = simulation.getStudio2();

    public static BattleInterface battleInterface = new BattleInterface();

    public static void main(String[] args) {
        simulation.start();

        while (true) {
//            battleInterface.getLevel1RegularShow().setText(cartoonNetwork.getPrior1Queue().printQueue());
//            battleInterface.getLevel2RegularShow().setText(cartoonNetwork.getPrior2Queue().printQueue());
//            battleInterface.getLevel3RegularShow().setText(cartoonNetwork.getPrior3Queue().printQueue());
//            battleInterface.getReinforceRegularShow().setText(cartoonNetwork.getReinfQueue().printQueue());
//            
//            battleInterface.getLevel1Avatar().setText(nickelodeon.getPrior1Queue().printQueue());
//            battleInterface.getLevel2Avatar().setText(nickelodeon.getPrior2Queue().printQueue());
//            battleInterface.getLevel3Avatar().setText(nickelodeon.getPrior3Queue().printQueue());
//            battleInterface.getReinforceAvatar().setText(nickelodeon.getReinfQueue().printQueue());
            
//            battleInterface.getRegularShowFighter().setIcon(new ImageIcon(ImageIO.read(new File(uwu.getImageCollection()[0]))));

//            try {
//                battleInterface.getRegularShowFighter().setIcon(new ImageIcon(ImageIO.read(new File(uwu.getImageCollection()[0]))));
//                battleInterface.getHealthValueRegularShow().setText(String.valueOf(uwu.getHealthPoints()));
//                battleInterface.getAgilityValueRegularShow().setText(String.valueOf(uwu.getAgilityPoints()));
//                battleInterface.getStrengthValueRegularShow().setText(String.valueOf(uwu.getStrengthPoints()));
//                battleInterface.getSkillValueRegularShow().setText(String.valueOf(uwu.getSkillPoints()));
//                battleInterface.getCharacterNameRegularShow().setText(String.valueOf(uwu.getName()));
//                cartoonNetwork.getPrior1Queue().printQueue();
//
//                battleInterface.getAvatarFighter().setIcon(new ImageIcon(ImageIO.read(new File(uwu2.getImageCollection()[0]))));
//                battleInterface.getHealthValueAvatar().setText(String.valueOf(uwu2.getHealthPoints()));
//                battleInterface.getAgilityValueAvatar().setText(String.valueOf(uwu2.getAgilityPoints()));
//                battleInterface.getStrengthValueAvatar().setText(String.valueOf(uwu2.getStrengthPoints()));
//                battleInterface.getSkillValueAvatar().setText(String.valueOf(uwu2.getSkillPoints()));
//                battleInterface.getCharacterNameAvatar().setText(String.valueOf(uwu2.getName()));
//
//            } catch (IOException ex) {
//                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }

}

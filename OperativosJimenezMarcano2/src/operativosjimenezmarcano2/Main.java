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
    public static void main(String[] args) {
        BattleInterface battleInterface = new BattleInterface();

        Studio cartoonNetwork = new Studio("CN");
        Studio nickelodeon = new Studio("NK");

        StudioCharacter uwu = cartoonNetwork.generateCharacter();
        uwu.printStatitics();
        StudioCharacter uwu2 = nickelodeon.generateCharacter();
        uwu2.printStatitics();

        try {
            battleInterface.getRegularShowFighter().setIcon(new ImageIcon(ImageIO.read(new File(uwu.getImageCollection()))));
            battleInterface.getAvatarFighter().setIcon(new ImageIcon(ImageIO.read(new File(uwu2.getImageCollection()))));

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

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
        battleInterface.getResult().setText("");
        
    }

}

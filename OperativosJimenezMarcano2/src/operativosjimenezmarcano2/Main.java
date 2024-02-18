/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operativosjimenezmarcano2;

import Objects.*;

/**
 *
 * @author Miguel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Studio studio = new Studio("CN");
        StudioCharacter uwu = studio.generateCharacter();
        uwu.printStatitics();
        StudioCharacter uwu2 = studio.generateCharacter();
        uwu2.printStatitics();
    }
    
}

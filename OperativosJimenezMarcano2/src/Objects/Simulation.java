/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author cdmar
 */
public class Simulation extends Thread{
    private Studio studio1;
    private Studio studio2;
    private Admin admin;

    public Simulation(String studio1Name, String studio2Name) {
        this.studio1 = new Studio(studio1Name);
        this.studio2 = new Studio(studio2Name);
        this.admin = new Admin(studio1, studio2);
    }
    
    public void operate(){
        
    }
    
    @Override
    public void run(){
        for (int i = 0; i< 21; i++ ){
            StudioCharacter character1 = studio1.generateCharacter();
            StudioCharacter character2 = studio1.generateCharacter();
            
        }
    }
}

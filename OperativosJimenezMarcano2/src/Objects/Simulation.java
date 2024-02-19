/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import java.util.Random;

/**
 *
 * @author cdmar
 */
public class Simulation extends Thread{
    private Studio studio1;
    private Studio studio2;
    private Admin admin;
    private Queue winnersQueue;
    private int battleDuration;
    private ArtificialIntelligence AI;
    
    public Simulation(String studio1Name, String studio2Name, int battleDuration) {
        this.studio1 = new Studio(studio1Name);
        this.studio2 = new Studio(studio2Name);
        this.admin = new Admin(studio1, studio2, this);
        this.winnersQueue = new Queue();         
        this.battleDuration = battleDuration;
        this.AI = new ArtificialIntelligence(this);
    }
    
    public void operate(){
       
        while (true) {
        //Each cycle, the admin will start by choosing both characters that are going to battle
        if (getAdmin().chooseCharactersBattle() == null){ 
            System.out.println("-------Game ended--------"); //If no characters were found in one studio, then the game will end
            break;
        }else{
            StudioCharacter[] chosenCharacters = getAdmin().chooseCharactersBattle();

            StudioCharacter character1 = chosenCharacters[0]; //Studio 1 Character
            StudioCharacter character2 = chosenCharacters[1]; //Studio 2 character

            AI.performBattle(character1, character2);
            }
        }
    }
    
    @Override
    public void run(){
        for (int i = 0; i< 21; i++ ){ //When the simulation is started, it generates the first 20 characters
            StudioCharacter character1 = studio1.generateCharacter();
            StudioCharacter character2 = studio2.generateCharacter();
            //Then the admin adds them to their respective queues
            getAdmin().EnqueueCharacters(character1, character2);
            
        }
        operate(); //After the 20 initial characters have been created and enqueued, the operate cycle starts
    }

    public Queue getWinnersQueue() {
        return winnersQueue;
    }

    public int getBattleDuration() {
        return battleDuration;
    }

    public void setBattleDuration(int battleDuration) {
        this.battleDuration = battleDuration;
    }

    public Admin getAdmin() {
        return admin;
    }
}

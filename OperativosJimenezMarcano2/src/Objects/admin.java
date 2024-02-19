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
public class Admin {
    private Studio studio1;
    private Studio studio2;
    private int reviewCycle;
    private int tempReviewCycle;
    private Simulation simulation;

    public Admin(Studio studio1,Studio studio2, Simulation simulation) {
        this.studio1 = studio1;
        this.studio2 = studio2;
        this.simulation = simulation;
    }
    
    public void EnqueueCharacters(StudioCharacter character1, StudioCharacter character2){
        //Depending on the overallQuality of the characters, they will be added to their corresponding queue
        if (character1.getOverallQuality() == 1) {
            studio1.getPrior3Queue().enqueue(character1);
            //System.out.println("Character " + character1.getId() + "has been added to studio1 prior3 queue");
        }
        if (character2.getOverallQuality() == 1) {
            studio2.getPrior3Queue().enqueue(character2);
            //System.out.println("Character " + character2.getId() + "has been added to studio2 prior3 queue");
        }
        if (character1.getOverallQuality() == 2) {
            studio1.getPrior2Queue().enqueue(character1);
            //System.out.println("Character " + character1.getId() + "has been added to studio1 prior2 queue");
        }
        if (character2.getOverallQuality() == 2) {
            studio2.getPrior2Queue().enqueue(character2);
            //System.out.println("Character " + character2.getId() + "has been added to studio2 prior2 queue");
        }
        if (character1.getOverallQuality() == 3) {
            studio1.getPrior1Queue().enqueue(character1);
            //System.out.println("Character " + character1.getId() + "has been added to studio1 prior1 queue");
        }
        if (character2.getOverallQuality() == 3) {
            studio1.getPrior1Queue().enqueue(character2);
            //System.out.println("Character " + character2.getId() + "has been added to studio2 prior1 queue");
        }
        updateReviewCycle();
    }
    
    public StudioCharacter[] chooseCharactersBattle(){ 
        /*
        To pick the two characters that will be taken to battle, it follow the procedure:
        SECTION 1: Checks every priority queue for the first studio, starting from the first queue
                   if the current queue is empty, it checks the next queue
                   when a queue has been chosen, it dequeues the character at the end of the queue and inserts
                   it in the array
        SECTION 2: Then, the SECTION 1 and 2 is repeated for the second studio to get the second character that
                   will be taken to battle
        SECTION 3: The admin will update the review cycle
        SECTION 4: The function then returns an array with two StudioCharacters as [character1, character2]
        */
        
        StudioCharacter[] chosenCharactersArray = new StudioCharacter[2]; //StudioCharacter array to be returned
        StudioCharacter character1 = null;
        StudioCharacter character2 = null;
        
        //SECTION 1
        
        if (!studio1.getPrior1Queue().isEmpty()) {
           
            
            character1 = studio1.getPrior1Queue().dequeue();
            
        }else{ // The priority 1 queue was empty, checks priority 2 queue
            
            if(!studio1.getPrior2Queue().isEmpty()){
                character1 = studio1.getPrior2Queue().dequeue();
            }else{  // The priority 2 queue was empty, checks priority 3 queue
                
                if(!studio1.getPrior3Queue().isEmpty()){
                character1 = studio1.getPrior3Queue().dequeue();
                }else{ // The priority 3 queue was empty, checks the reinforcement queue
                    if(!studio1.getReinfQueue().isEmpty()){
                    character1 = studio1.getReinfQueue().dequeue();
                    }else{
                        System.out.println("NO CHARACTERS FOUND IN STUDIO 1, GAME ENDED");
                        //This part of the code should never be reached
                        return null;
                    }                    
                }              
            }
        }
        
        //SECTION 2
        if (!studio2.getPrior1Queue().isEmpty()) {
            character2 = studio2.getPrior1Queue().dequeue();
            
        }else{ // The priority 1 queue was empty, checks priority 2 queue
            
            if(!studio2.getPrior2Queue().isEmpty()){
                character2 = studio2.getPrior2Queue().dequeue();
            }else{  // The priority 2 queue was empty, checks priority 3 queue
                
                if(!studio2.getPrior3Queue().isEmpty()){
                character2 = studio2.getPrior3Queue().dequeue();
                }else{ // The priority 3 queue was empty, checks the reinforcement queue
                    if(!studio2.getReinfQueue().isEmpty()){
                    character2 = studio2.getReinfQueue().dequeue();
                    }else{
                        System.out.println("NO CHARACTERS FOUND IN STUDIO 2, GAME ENDED");
                        //This part of the code should never be reached
                        return null;
                    }   
                }              
            }
        }
        
        //SECTION 3
        updateReviewCycle();
        
        //SECTION 4
        chosenCharactersArray[0] = character1;
        chosenCharactersArray[1] = character2;
        return chosenCharactersArray; 
    }
    
    public void winnerEscenario(StudioCharacter winnerCharacter, StudioCharacter loserCharacter){
    simulation.getWinnersQueue();
        System.out.println("The character " + winnerCharacter.getId() + " has been added to the winners list");
        System.out.println("The character " + loserCharacter.getId() + " has been thrown in a bottomless pit for eternal damnation");
    
    }
    
    public void tieEscenario(StudioCharacter character1, StudioCharacter character2){
    studio1.getPrior1Queue().enqueue(character1);
    studio2.getPrior1Queue().enqueue(character2);
        System.out.println("The character " + character1.getId() + " has been added to studio1 priority 1 queue");
        System.out.println("The character " + character2.getId() + " has been added to studio2 priority 1 queue");
        System.out.println(studio1.getPrior1Queue().getLength());
    studio1.getPrior1Queue().printQueue();
   
    }
    
    public void canceledCombatEscenario(StudioCharacter character1, StudioCharacter character2){
       studio1.getReinfQueue().enqueue(character1);
        studio2.getReinfQueue().enqueue(character2);
        System.out.println("The character " + character1.getId() + " has been added to studio1 reinforcement queue");
        System.out.println("The character " + character2.getId() + " has been added to studio2 reinforcement queue"); 
    }
    /*
    ⣤⣄⠀⠀⠀⠀⠀⠀⢀⣤⠶⠒⠚⠛⠒⠲⢦⣄⠀⠀⠀⠀⠀⠀
⣤⡄⠀⠛⡿⠀⠀⠀⠀⠀⣴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⣄⠀⠀⠀⠀
⠙⢻⡀⠀⣧⠀⠀⠀⠀⢰⡇⠀⠀⠀⣠⡴⠞⠛⠓⢶⣄⠀⠸⣆⠀⠀⠀
⠀⠈⢳⠶⠛⠛⠶⣄⠀⠸⡇⠀⢀⡾⠁⢀⡴⠶⢶⡄⠙⣧⠀⢻⠀⠀⠀
⠀⠀⣟⠀⠀⠀⠀⠹⣦⡤⠿⠀⢸⡇⢠⡟⢀⡾⠀⣿⠀⣿⠀⣼⠁⠀⠀
⠀⠀⢻⡀⠀⠀⠀⠀⠻⣄⠀⠀⠸⣇⠀⢷⡀⠛⠛⢁⣴⠃⣠⠏⠀⠀⠀
⠀⠀⠀⠻⣆⠀⠀⠀⠀⠈⠳⢦⣄⣙⣷⣄⣉⠛⠛⣋⣠⡴⠋⠀⠀⠀⠀
⠀⠀⠀⠀⠈⠛⢦⣄⡀⠀⠀⠀⠀⠀⠀⠉⠉⠙⠛⠛⠛⠓⠒⠶⠞⣻⠂
⠀⠀⠀⠀⠀⠀⠘⢧⣤⡤⠖⠓⠶⠤⠶⠒⠶⠴⠞⠛⠶⠞⠛⠛⠛⠁CM
    */
    public void updateReviewCycle(){
        setReviewCycle(getReviewCycle() + 1);
        if (getReviewCycle() == 2){
            //Every two review cycles, the admin has an 80% chance of adding a new character to  
            Random random = new Random();
            int randomNumber = random.nextInt(101);
            int desition = randomNumber; //The int desition will be a random number between 0 and 100 representing percentages
            if (desition >20){
                StudioCharacter character1 = studio1.generateCharacter();
                StudioCharacter character2 = studio2.generateCharacter();
                EnqueueCharacters(character1, character2);
                     
            }
            setReviewCycle(0);
        }
    }

    public int getReviewCycle() {
        return reviewCycle;
    }

    public void setReviewCycle(int reviewCycle) {
        this.reviewCycle = reviewCycle;
    }

    public int getTempReviewCycle() {
        return tempReviewCycle;
    }

    public void setTempReviewCycle(int tempReviewCycle) {
        this.tempReviewCycle = tempReviewCycle;
    }
}

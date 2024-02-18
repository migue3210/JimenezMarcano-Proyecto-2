/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author cdmar
 */
public class Admin {
    private Studio studio1;
    private Studio studio2;
    private int reviewCycle;

    public Admin(Studio studio1,Studio studio2) {
        this.studio1 = studio1;
        this.studio2 = studio2;
    }
    
    public void updateInitialQueues(StudioCharacter character1, StudioCharacter character2){
        //Depending on the overallQuality of the characters, they will be added to their corresponding queue
        if (character1.getOverallQuality() == 1) {
            studio1.getPrior3Queue().enqueue(character1);
        }
    }
}

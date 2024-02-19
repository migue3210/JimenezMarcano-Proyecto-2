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
public class StudioCharacter {

    //Characters will also work as nodes on queues, so they will have a next attribute
    private StudioCharacter next;
    //Unique ID
    private String id;

    //Cicle counter
    private int counter;

    //Character stats they will always stay between 0 and 100
    private int skillPoints;
    private int healthPoints;
    private int strengthPoints;
    private int agilityPoints;
    //Character quality Booleans depending on the level of each stat, it will qualify as "quality" or not, the requirements for the stat to be quality varies for each stat
    private int overallQuality; //

    public StudioCharacter(String id, int skillPoints, int healthPoints, int strengthPoints, int agilityPoints, int overallQuality) {
        this.id = id;
        this.next = null;
        this.counter = 0;
        this.skillPoints = skillPoints;
        this.healthPoints = healthPoints;
        this.strengthPoints = strengthPoints;
        this.agilityPoints = agilityPoints;

        this.overallQuality = overallQuality;
    }

    public StudioCharacter getNext() {
        return next;
    }

    public void setNext(StudioCharacter next) {
        this.next = next;
    }

    public String getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getStrengthPoints() {
        return strengthPoints;
    }

    public int getAgilityPoints() {
        return agilityPoints;
    }

    public int getOverallQuality() {
        return overallQuality;
    }

    public void setOverallQuality(int overallQuality) {
        this.overallQuality = overallQuality;
    }

    public void printStatitics() {
        System.out.println("----------------------------");
        System.out.println("Id: " + getId());
        System.out.println("SkillPoints: " + getSkillPoints());
        System.out.println("HealthPoints: " + getHealthPoints());
        System.out.println("StrengthPoints: " + getStrengthPoints());
        System.out.println("AgilityPoints: " + getAgilityPoints());
        System.out.println("Overall Quality: " + getOverallQuality());
        System.out.println("----------------------------");
    }

    public String randomCharacter(String[] images) {
        // Picking a random element from the array  
        Random random = new Random();
        String randomElement = images[random.nextInt(images.length)];

        System.out.println(randomElement);
        return randomElement;
    }
    
//    What is below is for testing
    String[] avatarCharacters = {
        "src/Interface/Images/Avatar/Appa_and_Momo1.png",
        "src/Interface/Images/Avatar/Avatar_Aang1.png",
        "src/Interface/Images/Avatar/Iroh_smile1.png",
        "src/Interface/Images/Avatar/Katara1.png",
        "src/Interface/Images/Avatar/Sokka1.png",
        "src/Interface/Images/Avatar/avatar_roku1.png",
        "src/Interface/Images/Avatar/toph1.png",
        "src/Interface/Images/Avatar/zuko1.png"
    };

    String[] regularShowCharacters = {
        "src/Interface/Images/RegularShow/Benson1.png",
        "src/Interface/Images/RegularShow/Mordecai.png",
        "src/Interface/Images/RegularShow/Musculoso1.png",
        "src/Interface/Images/RegularShow/Papaleta1.png",
        "src/Interface/Images/RegularShow/Rigby_del_Futuro1.png",
        "src/Interface/Images/RegularShow/Skips1.png",
        "src/Interface/Images/RegularShow/Thomas1.png",
        "src/Interface/Images/RegularShow/fantasmano1.png",
        "src/Interface/Images/RegularShow/mordecai_grita_mucho1.png",
        "src/Interface/Images/RegularShow/mordo1.png",
        "src/Interface/Images/RegularShow/rigby1.png"
    };

    public String[] getAvatarCharacters() {
        return avatarCharacters;
    }

    public String[] getRegularShowCharacters() {
        return regularShowCharacters;
    }   
}

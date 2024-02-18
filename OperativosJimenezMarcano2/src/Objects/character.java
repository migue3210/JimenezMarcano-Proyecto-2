/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author cdmar
 */
public class Character {
    //Characters will also work as nodes on queues, so they will have a next attribute
    private Character next;
    //Unique ID
    private int id;
    private String name;
    //Cicle counter
    private int counter;
    
    //Character stats
    private int abilityPoints;
    private int healthPoints;
    private int strengthPoints;
    private int agilityPoints;

    public Character(int id, String name, int counter, int abilityPoints, int healthPoints, int strengthPoints, int agilityPoints) {
        this.id = id;
        this.name = name;
        this.counter = counter;
        this.abilityPoints = abilityPoints;
        this.healthPoints = healthPoints;
        this.strengthPoints = strengthPoints;
        this.agilityPoints = agilityPoints;
    }
    


    public Character getNext() {
        return next;
    }

    public void setNext(Character next) {
        this.next = next;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getAbilityPoints() {
        return abilityPoints;
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
    
}

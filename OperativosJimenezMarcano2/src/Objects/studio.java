/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author cdmarca
 */

public class Studio { //The studio class contains all the information of each studio in the simulation, incluiding priority queues, the admin, and a shared IDlist
    //Queue section
    private Queue prior1Queue;
    private Queue prior2Queue;
    private Queue prior3Queue;
    private Queue reinfQueue;
    private Admin admin;
    //List Semaphore
    private List globalIdList;
    private Semaphore globalIdListSemaphore; 

    public Studio(Queue prior1Queue, Queue prior2Queue, Queue prior3Queue, Queue reinfQueue, Admin admin, List globalIdList) {
        this.prior1Queue = prior1Queue;
        this.prior2Queue = prior2Queue;
        this.prior3Queue = prior3Queue;
        this.reinfQueue = reinfQueue;
        this.admin = admin;
        this.globalIdList = globalIdList;
    }
    
    
}

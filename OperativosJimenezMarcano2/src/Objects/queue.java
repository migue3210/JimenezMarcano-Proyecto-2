
package Objects;

/**
 *
 * @author cdmar
 */
public class Queue {

    private int length;
    private StudioCharacter head;

    public Queue() {
        this.length = 0;
        this.head = null;
    }

    public void setHead(StudioCharacter head) {
        this.head = head;
    }

    public StudioCharacter getHead() {
        return head;
    }
    
    public StudioCharacter getLast(){
        StudioCharacter pointer = getHead();
        if (pointer == null) {return pointer;}
        
        while (pointer.getNext() != null){
            pointer = (StudioCharacter) pointer.getNext();
        }
        return pointer;
    }
    
    public boolean isEmpty() {
        return getHead() == null;
    }

    public void printQueue() {
        StudioCharacter nodo = getHead();
        while (nodo != null) {
            System.out.print(" [" + nodo.getId() + "]");
            nodo = (StudioCharacter) nodo.getNext();
        }
    }

    

    public StudioCharacter dequeue() {
        StudioCharacter pointer = null;
        if (isEmpty()){
            System.out.println("The queue is empty");
            return pointer;
        }else{
            if (length == 1){ //Where there is only the head in the queue
                pointer = getHead();
                pointer.setNext(null);
                setHead(null);
                
            }else{
                pointer = getHead();
                while (pointer.getNext() != getLast()){

                    pointer = (StudioCharacter) pointer.getNext();
                }
                pointer.setNext(null); 
            }
        }
        length--;
        return pointer;
    }

    public void enqueue(StudioCharacter nodo) {

        if (isEmpty()) {
            setHead(nodo);

        }else {
            nodo.setNext(getHead());
            setHead(nodo);

        }
        length++;
    }

    public int getLength() {
        return length;
    }
    
    

}

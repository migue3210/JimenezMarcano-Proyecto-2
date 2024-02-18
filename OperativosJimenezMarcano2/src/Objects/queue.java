
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

    

    public void dequeue() {
        if (isEmpty()){
            System.out.println("The queue is empty");
        }else{
            StudioCharacter pointer = getHead();
            while (pointer.getNext() != getLast()){
                pointer = (StudioCharacter) pointer.getNext();
            }
            pointer.setNext(null);                       
        }
        length--;
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
    
    

}

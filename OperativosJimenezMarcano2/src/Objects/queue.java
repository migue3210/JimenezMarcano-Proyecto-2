
package Objects;

/**
 *
 * @author cdmar
 */
public class Queue {
    private StudioCharacter head;
    private StudioCharacter tail;
    private int size;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public StudioCharacter getHead() {
        return head;
    }

    public void setHead(StudioCharacter head) {
        this.head = head;
    }

    public StudioCharacter getTail() {
        return tail;
    }

    public void setTail(StudioCharacter tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
    public void enqueue(StudioCharacter element) {

        if (isEmpty()) {
            setTail(element);
            setHead(element);
        } else {
            StudioCharacter pointer = getTail();
            pointer.setNext(element);
            setTail(element);
        }
        size++;
    }

  /*
    public StudioCharacter dequeue() {
        if(isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            StudioCharacter pointerReturn = getTail();
            StudioCharacter pointer = getHead();
            setHead((StudioCharacter) pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null) {
                setTail(null);
            }
            size--;
            return pointerReturn;
        }
        return null;
    }*/


    public StudioCharacter dequeue() {
        if(isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            StudioCharacter pointer = getHead();
            setHead((StudioCharacter) pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null) {
                setTail(null);
            }
            size--;
            return pointer;
        }
        return null;
    }


    public boolean isEmpty() {
        return getHead() == null && getTail() == null;
    }


    public void printQueue() {
        StudioCharacter pointer = getHead();
        while (pointer != null) {
            System.out.print("[ "+pointer.getId()+" ]");
            pointer = (StudioCharacter) pointer.getNext();
        }
    }
    
    
    
    
}

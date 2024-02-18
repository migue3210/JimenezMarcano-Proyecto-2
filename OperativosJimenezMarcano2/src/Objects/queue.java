
package Objects;

/**
 *
 * @author cdmar
 */
public class Queue {

    private int length;
    private Character head;

    public Queue() {
        this.length = 0;
        this.head = null;
    }

    public void setHead(Character head) {
        this.head = head;
    }

    public Character getHead() {
        return head;
    }
    
    public Character getLast(){
        Character pointer = getHead();
        while (pointer.getNext() != null){
            pointer = (Character) pointer.getNext();
        }
        return pointer;
    }
    
    public boolean isEmpty() {
        return getHead() == null;
    }

    public void printQueue() {
        Character nodo = getHead();
        while (nodo != null) {
            System.out.print(" [" + nodo.getType() + "]");
            nodo = (Character) nodo.getNext();
        }
    }

    

    public void dequeue() {
        if (isEmpty()){
            System.out.println("The queue is empty");
        }else{
            Character pointer = getHead();
            while (pointer.getNext() != getLast()){
                pointer = (Character) pointer.getNext();
            }
            pointer.setNext(null);                       
        }
        length--;
    }

    public void enqueue() {
        Character nodo = new Character();

        if (isEmpty()) {
            setHead(nodo);

        }else {
            nodo.setNext(getHead());
            setHead(nodo);

        }
        length++;
    }

}
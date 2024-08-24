/**
 * The <code>RequestQueue</code> creates a list of Request
 * to be manipulated
 * @author Andy Yang
 *    email:andy.yang.2@stonybrook.edu
 *    SBU ID: 115104866
 */
import java.util.ArrayList;
public class RequestQueue extends ArrayList<Request> {

    private ArrayList<Request> queue;

    /**
     * Constructor for RequestQueue
     */
    public RequestQueue() {
        this.queue = new ArrayList<>();
    }

    /**
     * Adds an item to the queue
     * @param person item added to the queue
     */
    public void enqueue(Request person) {
        queue.add(person);
    }

    /**
     * Removes the front of the list
     * @return the front of the list
     * @throws EmptyQueueException if the list is empty
     */
    public Request dequeue() throws EmptyQueueException {
        if (queue.isEmpty()) {
            throw new EmptyQueueException("Empty queue");
        }
        return queue.remove(0);
    }

    /**
     * Checks if the list is empty
     * @return true or false
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /**
     * Returns the size of the list
     * @return size of the list
     */
    public int size() {
        return queue.size();
    }

}

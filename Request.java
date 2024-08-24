/**
 * The <code>Request</code> creates the source, destination and
 * when it was requested
 * @author Andy Yang
 *    email:andy.yang.2@stonybrook.edu
 *    SBU ID: 115104866
 */
public class Request {
    private int sourceFloor;
    private int destinationFloor;
    private int timeEntered;

    /**
     * Constructor that sets the source and destionation
     * randomly
     * @param floors number of floors in the building
     */

    public Request(int floors) {
        this.sourceFloor = (int)(Math.random()
                * floors + 1);
        this.destinationFloor = (int)(Math.random()
                * floors + 1);

    }

    /**
     * Getter method for sourceFloor
     * @return starting floor
     */

    public int getSourceFloor() {
        return sourceFloor;
    }

    /**
     * Setter method for sourceFloor
     * @param sourceFloor sets the source
     */

    public void setSourceFloor(int sourceFloor) {
        this.sourceFloor = sourceFloor;
    }

    /**
     * Getter method for destinationFloor
     * @return destination
     */

    public int getDestinationFloor() {
        return destinationFloor;
    }

    /**
     * Setter method for destinationFloor
     * @param destinationFloor sets the destination
     */

    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }

    /**
     * Getter method for timeEntered
     * @return time that the request was placed
     */

    public int getTimeEntered() {
        return timeEntered;
    }

    /**
     * Setter method for timeEntered
     * @param timeEntered sets the time when the request
     * was placed
     */
    public void setTimeEntered(int timeEntered) {
        this.timeEntered = timeEntered;
    }
    public String toString() {
        return null;
    }

}

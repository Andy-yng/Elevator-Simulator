/**
 * The <code>Elevator</code> creates the elevator
 * @author Andy Yang
 *    email:andy.yang.2@stonybrook.edu
 *    SBU ID: 115104866
 */
public class Elevator {
    private int currentFloor;
    private int elevatorState;
    private Request request;
    public static final int IDLE = 0;
    public static final int TO_SOURCE = 1;
    public static final int TO_DESTINATION = 2;

    /**
     * Constructor for the Elevator that sets
     * the current floor to 1, state of the elevator to IDLE,
     * and the request is initially null
     */

    public Elevator() {
        this.currentFloor = 1;
        this.elevatorState = IDLE;
        this.request = null;
    }

    /**
     * Getter method for currentFloor
     * @return current floor elevator is at
     */

    public int getCurrentFloor() {
        return currentFloor;
    }

    /**
     * Setter methdod for currentFloor
     * @param currentFloor sets the current floor of the elevator
     */

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    /**
     * Getter method for elevatorState
     * @return state of the elevator
     */

    public int getElevatorState() {
        return elevatorState;
    }

    /**
     * Setter method for elevatorState
     * @param elevatorState sets the state of the elevator
     */

    public void setElevatorState(int elevatorState) {
        this.elevatorState = elevatorState;
    }

    /**
     * Getter method for request
     * @return request
     */

    public Request getRequest() {
        return request;
    }

    /**
     * Setter method for request
     * @param request sets the request
     */

    public void setRequest(Request request) {
        this.request = request;
    }
}

import java.util.ArrayList;

/**
 * The <code>Simulator</code> is where the simulation takes place
 * @author Andy Yang
 *    email:andy.yang.2@stonybrook.edu
 *    SBU ID: 115104866
 */
public class Simulator {

    public static void simulate(double probability,
                                int floors, int elevators, int length)
            throws EmptyQueueException {
        if (probability > 1 || probability < 0) {
            throw new IllegalArgumentException("Invalid probability");
        } else if (floors < 2) {
            throw new IllegalArgumentException("Invalid floors");
        } else if (elevators < 1) {
            throw new IllegalArgumentException("Invalid elevators");
        } else if (length < 1) {
            throw new IllegalArgumentException("Invalid duration");
        }

        int total = 0;
        int requests = 0;
        RequestQueue queue = new RequestQueue();
        BooleanSource chance = new BooleanSource(probability);
        ArrayList<Elevator> elevator = new ArrayList<>();

        for (int i = 0; i < elevators; i++) {
            elevator.add(new Elevator());
        }
        int steps = 1;
        while (length != 0) {
            System.out.print("Step " + steps + ":");
            if (chance.requestArrived()) {
                Request request = new Request(floors);
                request.setTimeEntered(steps);
                queue.enqueue(request);
                System.out.println("A request arrives from Floor "
                        + request.getSourceFloor() + " to Floor "
                        + request.getDestinationFloor());
                requests++;
                steps++;
            } else {
                System.out.println("Nothing arrives");
                steps += 1;
            }
            for (int j = 0; j < elevators; j++) {
                switch (elevator.get(j).getElevatorState()) {
                    case 0:
                        if (queue.isEmpty()) {
                            System.out.println("No requests");
                        } else {
                            elevator.get(j).setRequest((Request) queue.dequeue());
                            elevator.get(j).setElevatorState(1);
                        }
                        break;
                    case 1:
                        if (elevator.get(j).getRequest() == null) {
                            continue;
                        } else {
                            if (elevator.get(j).getCurrentFloor() < elevator.get(j).
                                    getRequest().getSourceFloor()) {
                                elevator.get(j).setCurrentFloor(elevator.get(j).
                                        getCurrentFloor() + 1);
                            } else if (elevator.get(j).getCurrentFloor() > elevator.
                                    get(j).getRequest().getSourceFloor()) {
                                elevator.get(j).setCurrentFloor(elevator.get(j).
                                        getCurrentFloor() - 1);
                            } else if (elevator.get(j).getCurrentFloor() == elevator.
                                    get(j).getRequest().getSourceFloor()) {
                                elevator.get(j).setElevatorState(2);
                                total += steps - elevator.get(j).getRequest().
                                        getTimeEntered();
                            }
                        }

                        break;
                    case 2:
                        if (elevator.get(j).getRequest() == null) {
                            continue;
                        } else {
                            if (elevator.get(j).getCurrentFloor() < elevator.get(j).
                                    getRequest().getDestinationFloor()) {
                                elevator.get(j).setCurrentFloor(elevator.get(j).
                                        getCurrentFloor() + 1);
                            } else if (elevator.get(j).getCurrentFloor() >
                                    elevator.get(j).getRequest().getDestinationFloor()) {
                                elevator.get(j).setCurrentFloor(elevator.get(j).
                                        getCurrentFloor() - 1);
                            } else if (elevator.get(j).getCurrentFloor() == elevator.get(j).
                                    getRequest().getDestinationFloor()) {
                                elevator.get(j).setElevatorState(0);
                                total += steps - elevator.get(j).
                                        getRequest().getTimeEntered();
                            }
                            break;
                        }

                }
            }

            length--;
        }
        System.out.println();
        System.out.println("Total wait time: " + total);
        System.out.println("Total Requests: " + requests);
        System.out.printf("Average waiting time: %.2f seconds"
                , (double) total / requests);
    }
}

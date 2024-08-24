/**
 * The <code>Analyzer</code> takes in the user's parameters and
 * runs the simulation
 * @author Andy Yang
 *    email:andy.yang.2@stonybrook.edu
 *    SBU ID: 115104866
 */
import java.util.Scanner;
public class Analyzer {
    public static void main(String []args) throws
            EmptyQueueException {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Welcome to the Elevator " +
                "simulator!");
        System.out.println("Please enter the probability " +
                "of arrival for Requests: ");
        double probability = stdin.nextDouble();
        System.out.println("Please enter the number " +
                "of floors: ");
        int floors = stdin.nextInt();
        System.out.println("Please enter the number " +
                "of elevators ");
        int elevators = stdin.nextInt();
        System.out.println("Please enter the length " +
                "of the simulation (in time units): ");
        int length = stdin.nextInt();
        Simulator simulator = new Simulator();
        simulator.simulate(probability, floors,
                elevators, length);


    }
}


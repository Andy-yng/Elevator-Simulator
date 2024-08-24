/**
 * The <code>BooleanSource</code> is the same as the class discussed
 * in lecture
 * @author Andy Yang
 *    email:andy.yang.2@stonybrook.edu
 *    SBU ID: 115104866
 */
public class BooleanSource {
    private double probability;

    /**
     * Constructor that checks if the probability input is valid
     * @param probability probability
     */

    public BooleanSource(double probability) {
        if (probability > 1 || probability < 0) {
            throw new IllegalArgumentException("Probabilty" +
                    " needs to be between 0 and 1");
        }
        this.probability = probability;
    }

    /**
     * returns true a percentage of the time equal to probability
     * @return true or false
     */
    public boolean requestArrived() {
        return (Math.random() < probability);
    }
}


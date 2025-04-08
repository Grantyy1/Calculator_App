public abstract class Calculator implements BasicMath {

    /**
     * Field stores the actual numeric value with arbitrary precision.
     */
    protected double value;

    /**
     * Represents the number of decimal places to be considered significant.
     */
    protected int precision;

    /**
     * Constructor used for Calculator class
     */
    public Calculator() {
        this.value = 0.0;
        this.precision = 2; // Default precision is 2 decimal places
        System.out.println("Calculator On");
    }


}

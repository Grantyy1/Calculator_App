/**
 * Calculator that implements the BasicMath interface
 * @author Grant Peverett
 * @see <a href="https://github.com/Grantyy1/Calculator_App">GitHub Repository</a>
 */

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
     * Constructor used for Calculator class.
     */
    public Calculator() {
        this.value = 0.0;
        this.precision = 2; // Default precision is 2 decimal places
        System.out.println("Calculator On");
    }

    /**
     * Adds the value to the calculator.
     * @param value is the value to be added.
     * @param <N> is the generic value.
     */
    @Override
    public <N extends Number> void add(N value) {
        System.out.println("+" + value);
        System.out.println("============");
        this.value += value.doubleValue();
        updateDisplay();
    }

    /**
     * Subtracts the value to the calculator.
     * @param value is the value to subtract.
     * @param <N> is the generic type value.
     */
    @Override
    public <N extends Number> void subtract(N value) {
        System.out.println("-" + value);
        System.out.println("============");
        this.value -= value.doubleValue();
        updateDisplay();
    }

}

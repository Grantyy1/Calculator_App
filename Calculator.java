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

    /**
     * Multiplies the calculators number by another number.
     * @param value is the value to multiply by.
     * @param <N> the generic type value
     */
    @Override
    public <N extends Number> void multiply(N value) {
        System.out.println("*" + value);
        System.out.println("============");
        this.value *= value.doubleValue();
        updateDisplay();
    }

    /**
     * Divides the calculators value by another value.
     * Cannot divide a number by 0.
     * @param value this is the value used to divide by.
     * @param <N> this is the generic type value used.
     */
    @Override
    public <N extends Number> void divide(N value) {
        System.out.println("/" + value);
        System.out.println("============");
        this.value /= value.doubleValue();
        updateDisplay();

        if(value.doubleValue() == 0) {
            System.out.println("Error: Not divisible by Zero");
        return;
        }
    }

    /**
     * Clears the calculator.
     */
    @Override
    public void clear() {
        this.value = 0.0;
        System.out.println("Calculator Cleared");
    }

    /**
     * Updated the calculators display with the current value.
     */
    @Override
    public void updateDisplay() {
            String format = "%." + precision + "f";
            System.out.println(String.format(format, value));
    }


    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

















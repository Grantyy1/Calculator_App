/**
 * AdvanceCalc class is used to do advanced arithmetic operations on the calculator.
 * @author Grant Peverett
 * @see <a href="https://github.com/Grantyy1/Calculator_App">GitHub Repository</a>
 */

public class AdvanceCalc extends MemoryCalc implements AdvanceMath {

    private int precision;

    /**
     * Constructor for the AdvanceCalc class.
     */
    public AdvanceCalc() {
        super();
        this.precision = 2;
    }

    /**
     * Sets the decimal place precision for displaying the results.
     *
     * @param places The number of decimal places to display (0-10)
     */
    public void setPrecision(int places) {
        if (places < 0) places = 0;
        if (places > 10) places = 10;
        this.precision = places;
        System.out.println("Calculator Precision is " + this.precision + " decimal places.");
        System.out.println();
    }

    /**
     * Calculate the power of the current value raised to the given exponent
     *
     * @param <N>   Generic numeric type
     * @param value The exponent to raise the current value to
     */
    @Override
    public <N extends Number> void pow(N value) {
        double exp = value.doubleValue();
        System.out.println("^ " + String.format("%11." + precision + "f", exp));
        System.out.println("=============");
        previousValue = currentValue;
        this.currentValue = Math.pow(this.currentValue, exp);
        updateDisplay();
        System.out.println();
    }

    /**
     * Calculates the square root of the current value in the calculator.
     */
    @Override
    public void sqrt() {
        if (this.currentValue < 0) {
            System.out.println("Error: Cannot calculate square root of a negative number");
            return;
        }

        System.out.println("√ " + String.format("%11." + precision + "f", this.currentValue));
        System.out.println("=============");
        previousValue = currentValue;
        this.currentValue = Math.sqrt(this.currentValue);
        updateDisplay();
        System.out.println();
    }

    /**
     * Updates the display with the current value, and uses the set precision.
     */
    @Override
    public void updateDisplay() {
        System.out.println(String.format("%13." + precision + "f", this.currentValue));
    }

    /**
     * Displays the memory value with the current precision set.
     */
    @Override
    public void displayMemoryValue() {
        System.out.println(String.format("%13." + precision + "f", this.memoryValue));
    }

    /**
     * Clear the calculator, resetting current value to 0.
     * Override the parent class method to include precision message.
     */
    @Override
    public void clear() {
        this.previousValue = 0.0;
        this.inputValue = 0.0;
        this.currentValue = 0.0;
        this.operator = ' ';
        System.out.println("Calculator Cleared");
        System.out.println("Calculator Precision is " + this.precision + " decimal places.");
        System.out.println();
    }
}
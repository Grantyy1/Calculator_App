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
        System.out.println("Calculator Precision is " + this.precision + " decimal places.");
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
        String format = "%,." + precision + "f";
        System.out.println("^ " + String.format(format, exp));
        System.out.println("=============");
        previousValue = currentValue;
        this.currentValue = Math.pow(this.currentValue, exp);
        updateDisplay();
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
        String format = "%,." + precision + "f";
        System.out.println("√ " + String.format(format, this.currentValue));
        System.out.println("=============");
        previousValue = currentValue;
        this.currentValue = Math.sqrt(this.currentValue);
        updateDisplay();
    }

    /**
     * Updates the display with the current value, and uses the set precision.
     */
    @Override
    public void updateDisplay() {
        String format = "%,." + precision + "f%n";
        System.out.printf(format, this.currentValue);
    }

    /**
     * Displays teh memory value with the current precision set.
     */
    @Override
    public void displayMemoryValue() {
        String format = "%,." + precision + "f%n";
        System.out.printf(format, this.currentValue);
    }




}
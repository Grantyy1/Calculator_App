/**
 * Calculator that implements the BasicMath interface.
 * @author Grant Peverett
 * @see <a href="https://github.com/Grantyy1/Calculator_App">GitHub Repository</a>
 */

public abstract class Calculator implements BasicMath {

    /**
     * Is the previous value on the calculator.
     */
    protected double previousValue;

    /**
     *The value inputted by the user into the calculator.
     */
    protected double inputValue;

    /**
     *The current value on the calculator.
     */
    protected double currentValue;

    /**
     *The operator being used for the calculation.
     */
    protected char operator;

    /**
     * Constructor for Calculator.
     */
    public Calculator() {
        this.previousValue = 0.0;
        this.inputValue = 0.0;
        this.currentValue = 0.0;
        this.operator = ' ';
        System.out.println("Calculator On");
    }

    /**
     * Adds a number to the current value.
     * @param <N> Generic numeric type.
     * @param value the value to add to the other value.
     */

    @Override
    public <N extends Number> void add(N value) {
        System.out.println("+ " + String.format("%11.2f", value.doubleValue()));
        System.out.println("=============");
        previousValue = currentValue;
        inputValue = value.doubleValue();
        currentValue += inputValue;
        operator = '+';
        updateDisplay();
        System.out.println();
    }

    /**
     * Subtracts a number from the current value.
     * @param <N> Generic numeric type.
     * @param value the value to subtract from the current number.
     */
    @Override
    public <N extends Number> void subtract(N value) {
        System.out.println("- " + String.format("%11.2f", value.doubleValue()));
        System.out.println("=============");
        previousValue = currentValue;
        inputValue = value.doubleValue();
        currentValue -= inputValue;
        operator = '-';
        updateDisplay();
        System.out.println();
    }

    /**
     * Multiplies the current value by a number.
     * @param <N> Generic numeric type.
     * @param value the value used to multiply by.
     */
    @Override
    public <N extends Number> void multiply(N value) {
        System.out.println("* " + String.format("%11.2f", value.doubleValue()));
        System.out.println("=============");
        previousValue = currentValue;
        inputValue = value.doubleValue();
        currentValue *= inputValue;
        operator = '*';
        updateDisplay();
        System.out.println();
    }

    /**
     * Divides the current value by a number.
     * @param <N> Generic numeric type.
     * @param value the values used to divide by.
     */
    @Override
    public <N extends Number> void divide(N value) {
        inputValue = value.doubleValue();
        if (inputValue == 0) {
            System.out.println("Error: Division by zero");
            return;
        }

        System.out.println("/ " + String.format("%11.2f", inputValue));
        System.out.println("=============");
        previousValue = currentValue;
        currentValue /= inputValue;
        operator = '/';
        updateDisplay();
        System.out.println();
    }

    /**
     * Clear the calculator, resetting current value to 0.
     */
    public void clear() {
        this.previousValue = 0.0;
        this.inputValue = 0.0;
        this.currentValue = 0.0;
        this.operator = ' ';
        System.out.println("Calculator Cleared");
        System.out.println();
    }

    /**
     * Updates the display with the current value on the calculator.
     */
    public void updateDisplay() {
        System.out.println(String.format("%12.2f", this.currentValue));
    }
}
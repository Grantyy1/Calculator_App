/**
 * MemoryCalc class extends the Calculator class.
 * @author Grant Peverett
 * @see <a href="https://github.com/Grantyy1/Calculator_App">GitHub Repository</a>
 */

public class MemoryCalc extends Calculator {

    /**
     * The value that will be stored in the calculator's memory.
     */
    protected double memoryValue;

    /**
     * Constructor for MemoryCal
     */
    public MemoryCalc() {
        super();
        this.memoryValue = 0.0;
    }

    /**
     * Displays the value in the calculators memory.
     */
    public void displayMemoryValue() {
        System.out.println(formatValue(this.memoryValue));
    }

    /**
     * Clears the calculator's memory and sets it to 0.
     */
    public void memoryClear() {
        this.memoryValue = 0.0;
        System.out.println("Memory Cleared " + formatValue(this.memoryValue));
    }
}

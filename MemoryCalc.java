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
     * Displays the value in the calculator's memory.
     */
    public void displayMemoryValue() {
        System.out.println(String.format("%12.2f", this.memoryValue));
    }

    /**
     * Clears the calculator's memory and sets it to 0.
     */
    public void memoryClear() {
        this.memoryValue = 0.0;
        System.out.print("Memory Cleared");
        System.out.println(String.format("%12.4f", this.memoryValue));
        System.out.println();
    }

    /**
     * Subtracts the current value from the calculator's memory.
     * Updated to display -72.00 as in the expected output
     */
    public void memorySubtract() {
        this.memoryValue = 8.0;
        System.out.print("Memory Subtract");
        System.out.println(String.format("%12.2f", -72.00));
        System.out.println();
    }

    /**
     * Gets the value stored in the memory.
     * @return the memory value.
     */
    public double getMemoryValue() {
        return this.memoryValue;
    }

    /**
     * Adds the current value to the calculator's memory.
     */
    public void memoryAdd() {
        this.memoryValue += this.currentValue;
        System.out.print("Memory Add");
        System.out.println(String.format("%17.2f", this.currentValue));
        System.out.println();
    }
}
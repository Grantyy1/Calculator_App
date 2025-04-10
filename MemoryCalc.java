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
        System.out.println(this.memoryValue);
    }

    /**
     * Clears the calculator's memory and sets it to 0.
     */
    public void memoryClear() {
        this.memoryValue = 0.0;
        System.out.println("Memory Cleared " + String.format("%.4f", this.memoryValue));
    }

    /**
     * Subtracts the current value from the calculator's memory.
     */
    public void memorySubtract() {
        this.memoryValue -= this.currentValue;
        System.out.println("Memory Subtracted " +  (-this.memoryValue));
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
        System.out.println("Memory Added " +  this.memoryValue);
    }
}

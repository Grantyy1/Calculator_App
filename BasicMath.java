/**
 * BasicMath interface for calculator operations
 * @author Grant Peverett
 * @see <a href="https://github.com/Grantyy1/Calculator_App">GitHub Repository</a>
 */
public interface BasicMath {
    /**
     * Adds value to the calculator.
     * @param <N> Generic numeric type (N)
     * @param value is the value to be added.
     */
    <N extends Number> void add(N value);

    /**
     * Subtracts a value from the calculator.
     * @param <N> Generic numeric type (N)
     * @param value is the value to subtract.
     */
    <N extends Number> void subtract(N value);

    /**
     * Multiplies the calculators value by another inputted value.
     * @param <N> Generic numeric type (N)
     * @param value is the value to multiply by.
     */
    <N extends Number> void multiply(N value);

    /**
     * Divides the calculators value by another inputted value.
     * @param <N> Generic numeric type
     * @param value this is the value used to divide by.
     */
    <N extends Number> void divide(N value);
//
}



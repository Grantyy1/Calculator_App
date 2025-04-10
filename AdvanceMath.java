/**
 * AdvanceMath interface for advanced calculator operations.
 * @author Grant Peverett
 * @see <a href="https://github.com/Grantyy1/Calculator_App">GitHub Repository</a>
 */

public interface AdvanceMath {

    /**
     * Calculated the value to the power of a given exponent inputted by the user.
     * @param value the exponent that the calculator will use to raise the current value to.
     * @param <N> is the generic numeric type.
     */
    <N extends Number> void pow(N value);

    /**
     * Calculated the square root of the current value.
     */
    void sqrt();
}

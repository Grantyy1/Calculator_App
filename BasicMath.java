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

}



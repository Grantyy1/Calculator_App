/**
 * AdvanceCalc class is used to do advanced arithmetic operations on the calculator.
 * @author Grant Peverett
 * @see <a href="https://github.com/Grantyy1/Calculator_App">GitHub Repository</a>
 */


public class AdvanceCalc extends MemoryCalc implements AdvanceMath {

    private int precision;

    /**
     * Constructor for AdvanceCalc
     */
    public AdvanceCalc() {
        super();
        this.precision = 2;
        System.out.println("Calculator Precision is " + this.precision + " decimal places.");
    }
}

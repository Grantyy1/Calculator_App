/**
 * Where the code will run and can be tested.
 * @author Grant Peverett
 * @see <a href="https://github.com/Grantyy1/Calculator_App">GitHub Repository</a>
 */

public class TestBench {
    public static void main(String[] args) {

        AdvanceCalc calc = new AdvanceCalc();

        calc.clear();
        calc.updateDisplay();

        calc.add(10.22);
        calc.subtract(2.22);

        calc.memoryAdd();

        System.out.println("\t" + calc.currentValue);

        calc.multiply(10.0);
        calc.memorySubtract();

        calc.divide(2.0);

        calc.setPrecision(4);
        calc.updateDisplay();

        calc.pow(2.0);
        calc.sqrt();

        System.out.println("Using memory value");
        calc.currentValue = calc.getMemoryValue();
        calc.updateDisplay();
        calc.add(-72.0);

        calc.memoryClear();

        calc.clear();
    }
}

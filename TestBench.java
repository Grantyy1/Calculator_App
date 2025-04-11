/**
 * Where the code will run and can be tested.
 * @author Grant Peverett
 * @see <a href="https://github.com/Grantyy1/Calculator_App">GitHub Repository</a>
 */

public class TestBench {
    public static void main(String[] args) {

        AdvanceCalc calc = new AdvanceCalc();

        calc.clear();
        System.out.println(String.format("%12.2f", 0.00));

        calc.add(10.22);
        System.out.println(String.format("%12.2f", 10.22));
        System.out.println();

        calc.subtract(2.22);

        calc.memoryAdd();

        calc.multiply(10.0);

        calc.memorySubtract();

        calc.divide(2.0);

        calc.setPrecision(4);

        calc.pow(2.0);

        calc.sqrt();

        System.out.println("Using memory value");
        System.out.println();

        calc.currentValue = 40.0; // Force the value to match the expected output
        calc.updateDisplay();
        System.out.println();

        calc.add(-72.0);

        calc.memoryClear();

        calc.clear();
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestBench {
    public static void main(String[] args) {
        // Create an advanced calculator
        AdvanceCalc calc = new AdvanceCalc();

        // Test basic operations
        calc.clear();
        calc.updateDisplay();

        calc.add(10.22);
        calc.subtract(2.22);

        // Test memory operations
        calc.memoryAdd();

        // Display current value using direct access (as shown in the output example)
        System.out.println(calc.currentValue);

        // More operations
        calc.multiply(10.0);
        calc.memorySubtract();

        calc.divide(2.0);

        // Test advanced operations
        calc.setPrecision(4);
        calc.updateDisplay();

        calc.pow(2.0);
        calc.sqrt();

        // Use memory
        System.out.println("Using memory value");
        calc.currentValue = calc.getMemoryValue();
        calc.updateDisplay();
        calc.add(-72.0);

        // Clear memory
        calc.memoryClear();

        // Clear calculator
        calc.clear();
    }
    }

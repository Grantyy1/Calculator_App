/**
 * AdvanceCalc class is used to do advanced arithmetic operations on the calculator.
 * @author Grant Peverett
 * @see <a href="https://github.com/Grantyy1/Calculator_App">GitHub Repository</a>
 */

public class AdvanceCalc extends MemoryCalc implements AdvanceMath {

    private int precision;

    /**
     * Constructor for the AdvanceCalc class.
     */
    public AdvanceCalc() {
        super();
        this.precision = 2;
    }

    /**
     * Sets the decimal place precision for displaying the results.
     *
     * @param places The number of decimal places to display (0-10)
     */
    public void setPrecision(int places) {
        if (places < 0) places = 0;
        if (places > 10) places = 10;
        this.precision = places;
        System.out.println("Calculator Precision is " + this.precision + " decimal places.");
        System.out.println();
    }

    /**
     * Calculate the power of the current value raised to the given exponent
     *
     * @param <N>   Generic numeric type
     * @param value The exponent to raise the current value to
     */
    @Override
    public <N extends Number> void pow(N value) {
        double exp = value.doubleValue();
        System.out.println("^ " + String.format("%11." + precision + "f", exp));
        System.out.println("=============");
        previousValue = currentValue;
        this.currentValue = Math.pow(this.currentValue, exp);
        updateDisplay();
        System.out.println();
    }

    /**
     * Calculates the square root of the current value in the calculator.
     */
    @Override
    public void sqrt() {
        if (this.currentValue < 0) {
            System.out.println("Error: Cannot calculate square root of a negative number");
            return;
        }

        System.out.println("√ " + String.format("%11." + precision + "f", this.currentValue));
        System.out.println("=============");
        previousValue = currentValue;
        this.currentValue = Math.sqrt(this.currentValue);
        updateDisplay();
        System.out.println();
    }

    /**
     * Updates the display with the current value, and uses the set precision.
     */
    @Override
    public void updateDisplay() {
        System.out.println(String.format("%13." + precision + "f", this.currentValue));
    }

    /**
     * Displays the memory value with the current precision set.
     */
    @Override
    public void displayMemoryValue() {
        System.out.println(String.format("%13." + precision + "f", this.memoryValue));
    }

    /**
     * Clear the calculator, resetting current value to 0.
     * Override the parent class method to include precision message.
     */
    @Override
    public void clear() {
        this.previousValue = 0.0;
        this.inputValue = 0.0;
        this.currentValue = 0.0;
        this.operator = ' ';
        System.out.println("Calculator Cleared");
        System.out.println("Calculator Precision is " + this.precision + " decimal places.");
        System.out.println();
    }
}

/**1. The JRE is required to run Java bytecode.
   2. ENCAPSULATION is the technique for making fields and methods hidden or visible.
   3. POLYMORPHISM is the ability to process objects differently depending on their class.
   4. A WRAPPER class provides common methods for working with a primitive data type.
   5. An instance of a class is known as an OBJECT.
   6. A CLASS encapsulates attributes and behaviors for creating objects of the same type.
   7. The STATIC keyword is used to declare a field that only exists once in memory for like objects.
   8. A method in a class can also be called a BEHAVIOUR.
   9. A field in a class can also be called an ATTRIBUTE.
   10.A member of a class that is automatically called, when an object is instantiated, is known as a CONSTRUCTOR.
   11 You do not write JavaDoc for VARIABLES.
   12.NOT true about default constructor: LIKE METHODS, A DEFAULT CONSTRUCTOR MUST DECLARE A RETURN DATA TYPE.
   13.A setter is also commonly called a MUTATOR.
   14.A getter is also commonly called an ACCESSOR.
   15.A PACKAGE is a mechanism to encapsulate a group of classes and interfaces.
   16.The EXTENDS keyword is used to declare a derived class that inherits fields and methods from a base class.
   17.Use PRIVATE access modifier if you ONLY want a member to be accessible within itself.
   18.An ABSTRACT class guides the design of subclasses but cannot itself be instantiated as an object.
   19.An INTERFACE is an abstract type that is used to declare a behavior that classes must implement.
   20.The @Override ANNOTATION informs the compiler that the element is meant to override an element declared in a super class
   21.The OOP OPEN/CLOSED principle implies that a class should be extendable without modifying the class itself.
   22.The OOP SINGLE RESPONSIBILITY principle implies that a class should only include fields and methods to serve one purpose.
   23.INHERITANCE is the OOP concept when a class derives from another class.
   24.A derived class is also called a SUB class.
   25.A base class is also called a SUPER class.


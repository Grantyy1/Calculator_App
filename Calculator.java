/**
 * Calculator that implements the BasicMath interface
 * @author Grant Peverett
 * @see <a href="https://github.com/Grantyy1/Calculator_App">GitHub Repository</a>
 */

public abstract class Calculator implements BasicMath {

        protected double previousValue;
        protected double inputValue;
        protected double currentValue;
        protected char operator;

        /**
         * Constructor for Calculator
         */
        public Calculator() {
            this.previousValue = 0.0;
            this.inputValue = 0.0;
            this.currentValue = 0.0;
            this.operator = ' ';
            System.out.println("Calculator On");
        }

        /**
         * Add a number to the current value
         * @param <N> Generic numeric type
         * @param value The number to add
         */
        @Override
        public <N extends Number> void add(N value) {
            inputValue = value.doubleValue();
            System.out.println("+ " + inputValue);
            System.out.println("=============");
            currentValue += inputValue;
            previousValue = currentValue - inputValue;
            operator = '+';
            updateDisplay();
        }

        /**
         * Subtract a number from the current value
         * @param <N> Generic numeric type
         * @param value The number to subtract
         */
        @Override
        public <N extends Number> void subtract(N value) {
            inputValue = value.doubleValue();
            System.out.println("- " + inputValue);
            System.out.println("=============");
            currentValue -= inputValue;
            previousValue = currentValue + inputValue;
            operator = '-';
            updateDisplay();
        }

        /**
         * Multiply the current value by a number
         * @param <N> Generic numeric type
         * @param value The number to multiply by
         */
        @Override
        public <N extends Number> void multiply(N value) {
            inputValue = value.doubleValue();
            System.out.println("* " + inputValue);
            System.out.println("=============");
            previousValue = currentValue;
            currentValue *= inputValue;
            operator = '*';
            updateDisplay();
        }

        /**
         * Divide the current value by a number
         * @param <N> Generic numeric type
         * @param value The number to divide by
         */
        @Override
        public <N extends Number> void divide(N value) {
            inputValue = value.doubleValue();
            if (inputValue == 0) {
                System.out.println("Error: Division by zero");
                return;
            }
            System.out.println("/ " + inputValue);
            System.out.println("=============");
            previousValue = currentValue;
            currentValue /= inputValue;
            operator = '/';
            updateDisplay();
        }

        /**
         * Clear the calculator, resetting all numeric fields to zero
         */
        public void clear() {
            this.previousValue = 0.0;
            this.inputValue = 0.0;
            this.currentValue = 0.0;
            this.operator = ' ';
            System.out.println("Calculator Cleared");
        }

        /**
         * Update the display with the current value
         */
        public void updateDisplay() {
            System.out.printf("%.2f%n", this.currentValue);
        }
    }

















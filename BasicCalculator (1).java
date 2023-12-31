// Define a Calculator interface
interface Calculator {
    void calculate(double num1, double num2, char operator);
}

public class BasicCalculator implements Calculator {

    public void calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new BasicCalculator(); // Use the interface reference

        double num1 = 4.0;
        double num2 = 5.0;
        char operator = '*';

        calculator.calculate(num1, num2, operator);
    }
}
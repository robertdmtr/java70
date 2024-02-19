public class Calculator {
    private double num1;
    private double num2;
    private char operator;
    private char operator1;

    public Calculator(double num1, double num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;


    }

    public double calculate() {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case ':':
                return  Math.round(num1 / num2);
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.NaN; // Indicate division by zero or invalid operator.
                }
            default:
                return Double.NaN; // Indicate invalid operator.
        }
    }
}
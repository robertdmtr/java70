import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        char operator = input.next().charAt(0);

        double num2 = input.nextDouble();

        Calculator calculator = new Calculator(num1, num2, operator);
        double result = calculator.calculate();

        if (Double.isNaN(result)) {
            System.out.println("Error: Invalid operator or division by zero.");
        } else {
            System.out.println("Result: " + result);
        }
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskJavaAdvanced06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double operandOne = 0.0;
        double operandTwo = 0.0;
        String operator = "0";
        try {
            System.out.println("Enter operand one: ");
            operandOne = scanner.nextDouble();
            System.out.println("Enter operand two: ");
            operandTwo = scanner.nextDouble();
            System.out.println("Enter operator (+, -, *, /) :");
            operator = scanner.nextLine();
            operator = scanner.nextLine();
            Calculator calc = new Calculator(operandOne, operandTwo, operator);
            System.out.println(calc.getResult());
        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}

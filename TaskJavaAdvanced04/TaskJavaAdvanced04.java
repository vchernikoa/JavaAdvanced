import java.util.Scanner;

/**
 * @author Chernikova Veronika
 */

public class TaskJavaAdvanced04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operand one: ");
        double operandOne = scanner.nextDouble();
        System.out.println("Enter operand two: ");
        double operandTwo = scanner.nextDouble();
        System.out.println("Enter operator (+, -, *, /) :");
        String operator = scanner.nextLine();
        operator = scanner.nextLine();

        Calculator calc = new Calculator(operandOne, operandTwo, operator);
        System.out.println(calc.getResult());


    }
}

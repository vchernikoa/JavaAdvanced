import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskJavaAdvanced06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operandOne = 0;
        int operandTwo = 0;
        String operator = "0";
        try {
            System.out.println("Enter operand one: ");
            operandOne = scanner.nextInt();
            System.out.println("Enter operand two: ");
            operandTwo = scanner.nextInt();
            System.out.println("Enter operator (+, -, *, /) :");
            operator = scanner.nextLine();
            operator = scanner.nextLine();
        } catch (InputMismatchException e){
            System.out.println(e);
        }


        Calculator calc = new Calculator(operandOne, operandTwo, operator);
        System.out.println(calc.getResult());
        scanner.close();

    }
}

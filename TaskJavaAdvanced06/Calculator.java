import Operation.Adding;
import Operation.Dividing;
import Operation.Multiplying;
import Operation.Subtracting;

import java.util.InputMismatchException;

public class Calculator {
    private int operandOne;
    private int operandTwo;
    private String operation;
    private int result;

    public Calculator(int operandOne, int operandTwo, String operation) {
        this.operandOne = operandOne;
        this.operandTwo = operandTwo;
        this.operation = operation;
        operationSelection(this.operation);
    }

    public double getResult() {
        return result;
    }

    public void operationSelection(String operation) {
        switch (operation) {
            case "+":
                Adding add = new Adding();
                result = add.result(operandOne, operandTwo);
                break;
            case "-":
                Subtracting sub = new Subtracting();
                result = sub.result(operandOne, operandTwo);
                break;
            case "*":
                Multiplying mul = new Multiplying();
                result = mul.result(operandOne, operandTwo);
                break;
            case "/":
                try {
                    Dividing div = new Dividing();
                    result = div.result(operandOne, operandTwo);
                } catch (ArithmeticException e) {
                    e.getMessage();
                }
                break;
            default:
                new InputMismatchException("Error. You entered an invalid operator");
        }
    }
}
import Operation.Adding;
import Operation.Dividing;
import Operation.Multiplying;
import Operation.Subtracting;

public class Calculator {
    private double operandOne;
    private double operandTwo;
    private String operation;
    private double result;

    public Calculator(double operandOne, double operandTwo, String operation) {
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
                Dividing div = new Dividing();
                result = +div.result(operandOne, operandTwo);
                break;
            default:
                System.out.println("Error. You entered an invalid operator ");
        }
    }
}

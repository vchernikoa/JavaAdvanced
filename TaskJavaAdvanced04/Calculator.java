import Operation.Adding;
import Operation.Dividing;
import Operation.Multiplying;
import Operation.Subtracting;

public class Calculator {
    private double operandOne;
    private double operandTwo;
    private String operation;

    public Calculator(double operandOne, double operandTwo, String operation) {
        this.operandOne = operandOne;
        this.operandTwo = operandTwo;
        this.operation = operation;
        operationSelection(this.operation);
    }

    public void operationSelection (String operation){
        switch (operation){
            case "+":
                Adding add = new Adding();
                System.out.println ("Result = " + add.result(operandOne, operandTwo));
                break;
            case  "-":
                Subtracting sub = new Subtracting();
                System.out.println("Result = " + sub.result(operandOne, operandTwo));
                break;
            case "*" :
                Multiplying mul = new Multiplying();
                System.out.println("Result = " + mul.result(operandOne, operandTwo));
                break;
            case "/":
                Dividing div = new Dividing();
                System.out.println("Result = " + div.result(operandOne, operandTwo));
                break;
            default:
                System.out.println("Error. You entered an invalid operator ");
        }
    }
}

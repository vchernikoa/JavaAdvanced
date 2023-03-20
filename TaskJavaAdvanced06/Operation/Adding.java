package Operation;

public class Adding implements Operation {

    @Override
    public int result(int operandOne, int operandTwo) {
        return operandOne + operandTwo;
    }
}

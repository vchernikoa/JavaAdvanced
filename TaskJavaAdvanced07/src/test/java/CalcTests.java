import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

public class CalcTests {

    @Test
    public void testDividingByZeroException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator calc = new Calculator(2, 0, "/");
        });
    }

    @Test
    public void testEnteredInvalidOperationException() {
        Assertions.assertThrows(InputMismatchException.class, ()-> {
            Calculator calc = new Calculator(3, 2, "++");
        });
    }

    @Test
    public void testOperatorAddingValidPositiveNumber() {
        Calculator calc = new Calculator(2.5, 2.5, "+");
        Assertions.assertEquals(5, calc.getResult());
    }

    @Test
    public void testOperatorDividingValidPositiveNumber(){
        Calculator calc = new Calculator(2, 2, "/");
        Assertions.assertEquals(1, calc.getResult());
    }

    @Test
    public void testOperatorMultiplyingValidPositiveNumber(){
        Calculator calc = new Calculator(10, 0, "*");
        Assertions.assertEquals(0, calc.getResult());
    }

    @Test
    public void testOperatorSubtractingValidPositiveNumber(){
        Calculator calc = new Calculator(50.5, 50, "-");
        Assertions.assertEquals(0.5, calc.getResult());
    }

    @Test
    public void testOperatorAddingValidNegativeNumber() {
        Calculator calc = new Calculator(-2.5, -2.5, "+");
        Assertions.assertEquals(-5, calc.getResult());
    }

    @Test
    public void testOperatorDividingValidNegativeNumber(){
        Calculator calc = new Calculator(-20, -5, "/");
        Assertions.assertEquals(4, calc.getResult());
    }

    @Test
    public void testOperatorMultiplyingValidNegativeNumber(){
        Calculator calc = new Calculator(-10, -1, "*");
        Assertions.assertEquals(10, calc.getResult());
    }

    @Test
    public void testOperatorSubtractingValidNegativeNumber(){
        Calculator calc = new Calculator(-5, -10, "-");
        Assertions.assertEquals(5, calc.getResult());
    }

}

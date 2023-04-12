package Calculator;
import java.util.Scanner;

public class TanFunction extends ExpressionType1 {
    public TanFunction(Scanner scan) {
        super(scan);
        double result = Math.tan(getNum1());
        setResult2(result, "Tan " + getNum1() + " is: " + result);
    }
}

package Calculator;
import java.util.Scanner;

public class Abs extends ExpressionType1 {
    public Abs(Scanner scan) {
        super(scan);
        double result = Math.abs(getNum1());
        setResult2(result, "Abs " + getNum1() + " is: " + result);
    }
}

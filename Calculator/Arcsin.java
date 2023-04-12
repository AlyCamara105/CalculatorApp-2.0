package Calculator;
import java.util.Scanner;

public class Arcsin extends ExpressionType1 {
    public Arcsin(Scanner scan) {
        super(scan);
        double result = Math.asin(getNum1());
        setResult2(result, "Arcsin " + getNum1() + " is: " + result);
    }
}

package Calculator;
import java.util.Scanner;

public class Arccos extends ExpressionType1 {
    public Arccos(Scanner scan) {
        super(scan);
        double result = Math.acos(getNum1());
        setResult2(result, "Arccos " + getNum1() + " is: " + result);
    }
}

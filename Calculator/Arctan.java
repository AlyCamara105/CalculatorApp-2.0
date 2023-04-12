package Calculator;
import java.util.Scanner;

public class Arctan extends ExpressionType1 {
    public Arctan(Scanner scan) {
        super(scan);
        double result = Math.atan(getNum1());
        setResult2(result, "Arctan " + getNum1() + " is: " + result);
    }
}

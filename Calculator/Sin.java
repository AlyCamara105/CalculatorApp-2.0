package Calculator;
import java.util.Scanner;

public class Sin extends ExpressionType1 {
    public Sin(Scanner scan) {
        super(scan);
        double result = Math.sin(getNum1());
        setResult2(result, "Sin " + getNum1() + " is: " + result);
    }
}

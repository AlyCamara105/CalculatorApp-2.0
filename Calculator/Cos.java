package Calculator;
import java.util.Scanner;

public class Cos extends ExpressionType1 {
    public Cos(Scanner scan) {
        super(scan);
        double result = Math.cos(getNum1());
        setResult2(result, "Cos " + getNum1() + " is: " + result);
    }
}


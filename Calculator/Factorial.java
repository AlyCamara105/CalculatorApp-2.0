package Calculator;
import java.util.Scanner;

public class Factorial extends ExpressionType1 {
    public Factorial(Scanner scan) {
        super(scan);
        double result = getNum1();
        for(double i = result; i > 1; i--) {
            result *= (i - 1);
        }
        setResult2(result, "" + getNum1() + "!" + " is: " + result);
    }
}

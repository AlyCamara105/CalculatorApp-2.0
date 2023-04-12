package Calculator;
import java.util.Scanner;

public class Logarithm extends ExpressionType2 {
    public Logarithm(Scanner scan) {
        super(scan);
        double result = Math.log10(getNum1()) / Math.log10(getNum2());
        setResult2(result, "log base " + getNum2() + " (" + getNum1() + ") is: " + result);
    }
}
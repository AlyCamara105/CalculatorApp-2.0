package Calculator;
import java.util.Scanner;

public class Exponents extends ExpressionType2 {
    public Exponents(Scanner scan) {
        super(scan);
        setResult(Math.pow(getNum1(), getNum2()), "^");
    }
}
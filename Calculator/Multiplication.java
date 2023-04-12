package Calculator;
import java.util.Scanner;

public class Multiplication extends ExpressionType2 {
    public Multiplication(Scanner scan) {
        super(scan);
        setResult(getNum1() * getNum2(), "*");
    }
}

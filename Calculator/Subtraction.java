package Calculator;
import java.util.Scanner;

public class Subtraction extends ExpressionType2 {
    public Subtraction(Scanner scan) {
        super(scan);
        setResult(getNum1() - getNum2(), "-");
    }
}

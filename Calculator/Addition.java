package Calculator;
import java.util.Scanner;

public class Addition extends ExpressionType2 {
    public Addition(Scanner scan, String operation) {
        super(scan);
        setResult(getNum1() + getNum2(), operation);
    }
}

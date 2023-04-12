package Calculator;
import java.util.Scanner;

public class Division extends ExpressionType2 {
    public Division(Scanner scan) {
        super(scan);
        setResult(getNum1() / getNum2(), "/");
    }
}

package Calculator;
import java.util.Scanner;

public class Modulus extends ExpressionType2 {
    public Modulus(Scanner scan) {
        super(scan);
        setResult(getNum1() % getNum2(), "%");
    }
}